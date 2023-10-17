package org.example.chapter5.item26;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {

	public static void main(String[] args){

		// 용어 정리

//		타입 매개변수
//		Node<String> stringNode = new Node<>();
//		stringNode.set("아이템");
//		System.out.println(stringNode.get());

//		Node2<Integer> integerNode2 = new Node2<>();
//		Node2<Long> longNode2 = new Node2<>();
//		Node2<String> stringNode2 = new Node2<>();

		// 비한정 와일드 카드 타입 == unbounded wildcard type
		// <?> : <? extend Object> 가 생략된 것
//
//		Node node = new Node<>();

		Node<Object> node2 = new Node<>();

		node2.set(1);

//		node.set(null);
//		node.set("아이템");

		List<Object> list = new ArrayList<>();
		Integer num = 1;
		String str = "sdf";
		list.add(str);
		list.add(num);

		System.out.println(list);
//
//		System.out.println(list);
	}

	public void listTest(List<Object> list) {
		list.add("str");
		list.add(1);
	}



	public List<?> getList() {

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			list.add(i);
		}

		return list;
	}

}
