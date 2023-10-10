package org.example.chapter1.item6;

import java.util.regex.Pattern;

public class RomanNumerals {

	/**
	 * isRomanNumeralSlow 메서드를 호출할 때 마다 matches 메서드를 통해 정규식을 컴파일 하고 매칭을 수행
	 * isRomanNumeralFast 메서드는 클래스가 로딩 될 때 한 번만 정규식을 컴파일하고 그 결과를 재사용
	 * 여기서의 컴파일은 JVM의 JIT 컴파일러를 통한 컴파일을 의미합니다.
	 *
	 * 전통적인 컴파일 : source code -> byte code
	 * JIT 컴파일 : 프로그램이 실행되는 동안에 (즉, 필요할 때) source code -> byte code
	 * 여기서는 ROMAN 을 native code로 변환시켜서 재사용할 수 있게 만듦 (GC의 영향을 받지 않는 JVM 밖의 code cache 메모리 공간에 저장)
	 */

	static boolean isRomanNumeralSlow(String s) {
		return s.matches("^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
	}

	private static final Pattern ROMAN = Pattern.compile(
			"^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

	static boolean isRomanNumeralFast(String s) {
		return ROMAN.matcher(s).matches();
	}

	public static void main(String[] args) {
		boolean result = false;
		long start = System.nanoTime();
		for (int j = 0; j < 100; j++) {
			result = isRomanNumeralFast("MCMLXXVI");
		}
		long end = System.nanoTime();
		System.out.println(end - start);
		System.out.println(result);
	}
}
