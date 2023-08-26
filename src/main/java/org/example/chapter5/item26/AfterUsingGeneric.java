package org.example.chapter5.item26;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AfterUsingGeneric {

	public static void main(String[] args){

		// 숫자만 넣어서 사용하는 List
		List<Objects> nums = new ArrayList<>();
		Integer result = 0;
//		nums.add("4");



		System.out.println(nums.get(0));
	}
}
