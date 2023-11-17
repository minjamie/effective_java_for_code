package org.example.chapter6.item37;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class MapTest {
	public enum Days {
		Sunday, Monday, Tuesday, Wendnesday;
	}

	public static void setDays(Map<Days, Integer> map) {
		map.put(Days.Sunday, 1);
		map.put(Days.Monday, 2);
		map.put(Days.Tuesday, 3);
		map.put(Days.Wendnesday, 4);
	}

	private static long getPerform(Map<Days, Integer> map) {
		long startTime = System.nanoTime();
		for (int j = 0; j < 100000000; j++) {
			map.get(Days.Wendnesday);
		}
		long endTime = System.nanoTime();

		return endTime - startTime;

	}

	public static void main(String[] args) {
		// Creating an EnumMap of the Days enum
		EnumMap<Days, Integer> enumMap = new EnumMap<>(Days.class);
		setDays(enumMap);

		Map<Days, Integer> hashMap = new HashMap<>();
		setDays(hashMap);

		System.out.println("hashMap : " + getPerform(hashMap));

		System.out.println("enumMap : " + getPerform(enumMap));

	}
}
