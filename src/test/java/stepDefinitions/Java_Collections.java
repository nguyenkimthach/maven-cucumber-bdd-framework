package stepDefinitions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Java_Collections {

	public static void main(String[] args) {
		Map<Integer, String> myMap = new HashMap<>();
		myMap.put(1, "Java");
		myMap.put(2, "JavaFX");
		myMap.put(3, "CoffeeScript");
		myMap.put(4, "TypeScript");

		ArrayList<String> valueList = new ArrayList<String>(myMap.values());
		System.out.println(valueList);

		// [Java, JavaFX, CoffeeScript, TypeScript]
		// 0123
		System.out.println(valueList.get(0));
		System.out.println(valueList.get(1));
		System.out.println(valueList.get(2));
		System.out.println(valueList.get(3));
		System.out.println(valueList.get(4));
	}

}