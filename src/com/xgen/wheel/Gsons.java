package com.xgen.wheel;

import java.io.OutputStream;

public class Gsons {
	
	
	public void write(Object[] object, OutputStream out,StringBuilder s) {
		s.append("[");
		for (Object o : object) {
			if (object != null) {
				if (o.getClass().isArray()) {
					Gsons gsons = new Gsons();
					gsons.write((Object[])o, out,s);
				} else {
					Gson gson = new Gson();
					gson.write(o, out,s);
				}
			} else {
				System.out.println("null");
			}
		}
		s.append("]");
	} 
}