package org.example.chapter3.item18.juwon;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class InstrumentedHashSet<E> extends HashSet<E> {

	/**
	 * Java에서 제공하는 HashSet 을 상속해 구현한 클래스
	 * HashSet 에 추가되는 원소의 개수를 확인할 수 있는 클래스
	 * addAll, add 메서드 실행시 addCount 를 증가시키는 메소드를 추가하여 오버라이딩
	 *
	 * main 결과?
	 *
	 * 해결 방법
	 * 1. addAll() 메소드를 재정의 하지 않음
	 * 2. addAll() 메소드의 다른식으로 구현을 재정의
	 * 3. 상위 클래스인 HashSet 에 새로운 메소드를 추가
	 *
	 */

	private int addCount = 0;

	public InstrumentedHashSet() {
	}

	public InstrumentedHashSet(int initCap, float loadFactor) {
		super(initCap, loadFactor);
	}

	@Override public boolean add(E e) {
		addCount++;
		return super.add(e);
	}

	@Override public boolean addAll(Collection<? extends E> c) {
		addCount += c.size();
		return super.addAll(c);
	}

	public int getAddCount() {
		return addCount;
	}

	public static void main(String[] args) {

		InstrumentedHashSet<String> hashSet = new InstrumentedHashSet<>();
		hashSet.addAll(List.of("A", "B", "C"));
		System.out.println(hashSet.getAddCount());
	}
}
