package org.example.chapter2.item11;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	/**
	 * 1. map.get(number2)
	 *
	 * 2. 같은 값으로 value 값을 찾을 때
	 *
	 * HashMap에 값을 넣을 때 : hashcode() 실행 어떤 버킷에 넣을지 결정
	 * HashMap에서 값을 꺼낼 때 : key에 대한 hashCode 값을 통해서 버킷을 찾고 객체를 가져옴
	 * hashCode를 재정의하지 않았기 떄문
	 *
	 *
	 * 3. 모든 객체가 HashCode가 같다면?
	 *
	 * 찾을 수 있지만, 성능 저하
	 * 해시 충돌이 발생했을 때, HashMap은 LinkedList 데이터를 저장
	 * 조회 시 O(N)
	 *
	 * Java 8이후 B-Tree로 변경
	 * 조회 시 O(longN)
	 *
	 *
	 */

	public static void main(String[] args){
		Map<PhoneNumber, String> map = new HashMap<>();

		PhoneNumber number1 = new PhoneNumber(123, 456, 7890);
		PhoneNumber number2 = new PhoneNumber(123, 456, 7890);

		System.out.println(number1.equals(number2));
		System.out.println(number1.hashCode());
		System.out.println(number2.hashCode());

		map.put(number1, "juwon");
		map.put(number2, "jutwo");

		String s = map.get(number2);
//		String s = map.get(new PhoneNumber(123, 456, 7890));
		System.out.println(s);
	}
}
