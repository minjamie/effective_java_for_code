package org.example.chapter5.item26;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BeforeUsingGeneric {

	public static void main(String[] args){

		// 리스트에 숫자를 넣고 다 더해주는 함수
		// Object 데이터를 다루는 한계
		// law 타입 : 제네틱 타입 x
		List nums = new ArrayList();

//		Objects result = 0;
		Integer result = 0;

		nums.add(1);
		nums.add(2);
		nums.add(3);
//		nums.add("4");

		for (Object num : nums) {
//			result +=  num;
			result += (Integer) num;
		}

//		System.out.println(result);

	}

}
