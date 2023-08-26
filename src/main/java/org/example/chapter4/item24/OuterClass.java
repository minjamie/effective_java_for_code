package org.example.chapter4.item24;

import javax.print.attribute.IntegerSyntax;

public class OuterClass {

	private static String outerClassField = "outerClassField";
	private String outerClassField2 = "outerClassField2";


	//정적 멤버 클래스
	//OuterClass 정적 멤버 변수에 접근 할 수 있음
	//OuterClass 인스턴스를 필요로 하지 않음
	public static class StaticMemberClass {

		void play() {
			System.out.println("StaticMemberClass.play" + outerClassField);
		}
	}

	//비정적 멤버 클래스
	//OuterClass 인스턴스가 필요함
	//인스턴스가 없다면 인스턴스화 할 수 없음
	//비정적 멤버 클래스가 사용되는 곳 : 어댑터 패턴
	public class InnerClass {

		private String innerClassField = "innerClassField";

		//play() 메소드와 같이 OuterClass 참조하지 않는다면 비정적 멤버 클래스에 적합 x
		//따라서 비효율적인 코드 -> 정적 멤버 클래스로 바꿔야함
		void play() {
			System.out.println("InnerClass.play" + innerClassField);
		}

		//play2() 메소드 처럼 OuterClass 참조해야 의미가 있음
		void play2() {
			System.out.println(OuterClass.this.outerClassField2);
		}
	}

	void outerMethod() {
		int outerData = 5;


		// 지역 클래스(로컬 클래스)
		// 메서드가 종료 될 때 까지 사용 가능
		class LocalClass {

			void play() {
				System.out.println("LocalClass.play");
				System.out.println(OuterClass.this.outerClassField2);
			}
		}


	}


	public static void main(String[] args) {

		// 익명 클래스
		// 인스턴스의 이름이 없음
		// 표현식 중간에 등장 -> 코드가 길어짐 -> 가독성 저하
		// 자바 8이후 람다 or 메소드 레퍼런스도 대체되고 있음
		OuterClass outerClass2 = new OuterClass();
		OuterClass outerClass = new OuterClass() {
			@Override
			void outerMethod() {
				System.out.println("익명클래스 메소드");;
				System.out.println(OuterClass.outerClassField);
				System.out.println(outerClass2.outerClassField2);
			}

			void play() {
				System.out.println();
			}
		};

		outerClass.outerMethod();
	}


}
