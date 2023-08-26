package org.example.chapter4.item21;

public class Main {

	public static void main(String[] args) {

		CalculatorService service = new CalculatorService();

		System.out.println(service.plus(1, 1));
		System.out.println(service.division(1, 0));

//		Kind를 구현한 CalculatorService 입장에서 division 메소드는 위험한 기능일 수도 있습니다.
	}
}
