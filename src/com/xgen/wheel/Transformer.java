package com.xgen.wheel;


public class Transformer {
	
	
	
	public void toGson(Object object) {
		Gson gson = new Gson();
		StringBuilder s = new StringBuilder();
		gson.write(object,System.out,s);
		System.out.println(s);
	}

	public void toGson(Object[] object) {
		Gsons gson = new Gsons();
		StringBuilder s = new StringBuilder("{");
		gson.write(object, System.out, s);
		s.append("}");
		System.out.println(s);
	}

}
