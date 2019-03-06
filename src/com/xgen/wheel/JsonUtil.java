package com.xgen.wheel;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class JsonUtil {

	public static void main(String[] args) {
		String str = "{\"firstName\": \"Brett\", \"lastName\": \"McLaughlin\"}";
		JsonUtil util = new JsonUtil(str);
		util.tansformer(Person.class);
		System.out.println(str);
	}

	static String str;

	public JsonUtil(String str) {
		this.str = str;
	}

	public void tansformer(Class clazz) {
		Object o = null;
		Constructor c;
		try {
			String[] s = str.substring(1,str.length()-1 ).split(",");
			String[] s1 = s[0].split(":");
			c = clazz.getDeclaredConstructor();
			o = c.newInstance();
			Field[] fs = clazz.getDeclaredFields();
			for(Field f : fs){
				String name = f.getName();
				String name2 = name.substring(0,1).toUpperCase()+name.substring(1);
				Method m = clazz.getMethod("set", f.getType());
				m.invoke(o, s1[2]);
			}
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
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
