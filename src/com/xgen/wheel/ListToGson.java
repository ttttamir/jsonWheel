package com.xgen.wheel;

import java.awt.List;
import java.io.OutputStream;
import java.util.LinkedList;

public class ListToGson {

	public void write(LinkedList<Object> value, OutputStream out, StringBuilder s) {
		s.append("[");
		for (int index = 0; index < value.size(); index++) {
			Gson gson = new Gson();
			gson.write(value.get(index), out, s);
		}
		s.append("]");
	}

}
