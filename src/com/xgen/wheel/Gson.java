package com.xgen.wheel;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedList;

public class Gson implements Serializable {

	public void write(Object o, OutputStream out, StringBuilder s) {

		s.append("{");
		Class clazz = o.getClass();
		Method[] ms = clazz.getDeclaredMethods();

		for (Method m : ms) {
			if (m.getName().startsWith("get")) {
				String methodName = m.getName();

				// 如：getFirstname --> firstname
				String key = methodName.substring(3).toLowerCase();

				// 获得对象中name的值
				try {
					Object value = m.invoke(o);
					if (value instanceof String) {
						s.append(String.format("%s:\"%s\",", key, value));
					} else if (value instanceof Integer) {
						s.append(String.format("%s:%s,", key, value));
					} else if (value instanceof Byte) {
						s.append(String.format("%s:%s,", key, value));
					} else if (value instanceof Long) {
						s.append(String.format("%s:%s,", key, value));
					} else if (value instanceof Double) {
						s.append(String.format("%s:%s,", key, value));
					} else if (value instanceof Float) {
						s.append(String.format("%s:%s,", key, value));
					} else if (value instanceof Short) {
						s.append(String.format("%s:%s,", key, value));
					} else if (value instanceof Boolean) {
						s.append(String.format("%s:%s,", key, value));
					} else if (value instanceof Character) {
						s.append(String.format("%s:\'%s\',", key, value));
					} else if (value == null) {
						s.append(String.format("%s:%s,", key, null));
					} else if (value.getClass().isArray()) {
						s.append(key + ":");
						Gsons gsons = new Gsons();
						gsons.write((Object[]) value, out, s);
						s.append(",");
					} else if (value instanceof LinkedList) {
						// linkedList
						s.append(key + ":");
						ListToGson toGson = new ListToGson();
						toGson.write((LinkedList<Object>) value, out, s);
						s.append(",");

					} else if (value instanceof LinkedList) {
						// 类
						s.append(key + ":");
						Gson gson = new Gson();
						gson.write(value, out, s);
						s.append(",");

					}
				} catch (SecurityException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}

		if (s.toString().endsWith(",")) {
			s.deleteCharAt(s.length() - 1);
		}

		s.append("}");
	}
}