package com.dictionary;

import java.util.HashMap;

class Dict {

	HashMap<String, String> dict;

	public Dict() {
		dict = new HashMap<String, String>();
	}

	String add(String key, String value) {
		if (dict.get(key) != null)
			return "message already exists";

		dict.put(key, value);
		return "message added successfully";
	}

	String update(String key, String value) {
		dict.put(key, value);
		return "updated successfully";
	}

	String remove(String key) {
		if (dict.containsKey(key)) {
			dict.remove(key);
			return "removed successfully";
		}
		return "searched message doesnot exists";
	}

	String search(String x) {
		return dict.get(x);
	}
}

public class Dictionary {
	public static void main(String[] args) {
		Dict dict = new Dict();
		dict.add("test", "Test it");
		System.out.println(dict.add("hi", "A way to wish"));

		System.out.println(dict.search("test"));
		System.out.println(dict.update("test", "test again"));
		System.out.println(dict.remove("xu"));
	}
}
