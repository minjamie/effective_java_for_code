package org.example.chapter5.item26;

import java.util.List;
import java.util.Objects;

public class GenericType<E> {

	private E e;
	int a = 1;


	public static void main(String[] args){

//		System.out.println(GenericType<String>.class);

//		.class => 리터럴 -> 정적인 정보만을 가짐
//		GenericType<String> => 여러 타입의 매개변수를 가지는 복합적인 타입
//		결론 : 서로 다른 개념

//		기본타입, 배열타입은 허용
		System.out.println(List.class);
		System.out.println(String[].class);
		System.out.println(String[].class);
		System.out.println(GenericType.class);

		GenericType<String> stringType = new GenericType<>();

		// 제네릭 타입 정보는 컴파일 시에 캐스팅 됨
		// 러타임 시에는 소거 => 타입을 검사하는 행위는 의미 없어지고 가독성 저하
		System.out.println(stringType instanceof GenericType);
//		System.out.println(stringType instanceof GenericType<String>);

	}

}
