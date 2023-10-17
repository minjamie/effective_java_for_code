package org.example.chapter5.item26;

public class Node<E> {
	// 제네릭 타입
	// 제네릭 클래스 , 인터페이스면 제네릭 인터페이스

	private E item;

	public void set(E e) {
		this.item = e;
	}

	public E get() {
		return this.item;
	}

}
