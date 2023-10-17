package org.example.chapter5.item26;

import java.util.Set;

public class Numbers {

	// raw Vs wildCard : 안정성
	// 런타인 전에 컴파일 오류를 찾을 수 있음.

//	static int numElementsInCommon(Set s1, Set s2) {
//		s1.add("AWDASDASD");
//		int result = 0;
//		for (Object o1 : s1) {
//			if (s2.contains(o1)) {
//				result++;
//			}
//		}
//
//		return result;
//	}
//
//	static int numElementsInCommon(Set<?> s1, Set<?> s2) {
////		s1.add("AWDASDASD");
//		int result = 0;
//		for (Object o1 : s1) {
//			if (s2.contains(o1)) {
//				result++;
//			}
//		}
//
//		return result;
//	}



	public static void main(String[] args) {
//		System.out.println(Numbers.numElementsInCommon(Set.of(1, 2, 3), Set.of(1, 2)));
	}

}
