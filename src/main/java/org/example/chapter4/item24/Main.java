package org.example.chapter4.item24;

import org.example.chapter4.item24.OuterClass.InnerClass;
import org.example.chapter4.item24.OuterClass.StaticMemberClass;

public class Main {

	public static void main(String[] args) {

		StaticMemberClass staticMemberClass = new StaticMemberClass();
		staticMemberClass.play();

//		InnerClass innerClass = new InnerClass();
		OuterClass outerClass = new OuterClass();
		InnerClass innerClass = outerClass.new InnerClass(); // 비정적 문맥에서만 인스턴스를 참조할 수 있다. 라는 의미

//		outerClass 의도치 않게 사용될 수 있음
//		GC가 수거를 못함 -> 메모리 누수
		outerClass = null;
		innerClass.play2();

//		비정적 문맥에서만 인스턴스를 참조할 수 있다.
//		outerClass.outerMethod();
	}
}

