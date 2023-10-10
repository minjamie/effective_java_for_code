package org.example.chapter1.item6;

public class Sum {

	/**
	 * sum += i; 이 부분에서 long -> Long 으로 오토박싱
	 * 불필요한 인스턴스를 생성 -> 메모리, 시간 낭비가 일어남
	 */

	private static long sum() {
		long sum = 0L;
		for (long i = 0; i <= Integer.MAX_VALUE; i++)
			sum += i;
		return sum;
	}

	public static void main(String[] args) {
		long start = System.nanoTime();
		long x = sum();
		long end = System.nanoTime();
		System.out.println((end - start) / 1_000_000. + " ms.");
		System.out.println(x);
	}
}
