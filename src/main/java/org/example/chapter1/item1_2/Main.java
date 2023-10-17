package org.example.chapter1.item1_2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args){

		/**
		 * 인터페이스  기반의 프레임워크를 사용할 수 있도록 강제할 수 있습니다.
		 * 또한 구현을 client 부터 숨길 수 있습니다.
		 */
//		RockScissorPaper service2 = RockScissorPaperFactory.of("Scissor");
//		System.out.println(service2.something());

		RockScissorPaper service = RockScissorPaper.of("ROCK");
		System.out.println(service.something());

		/**
		 * JAVA 8 이후 static 메서드를 인터페이스에 구현 할 수 있기 때문에
		 * 인터페이스에 구현하여 팩토리 클래스를 따로 생성하지 않고 인터페이스 생성만으로도 해결이 가능합니다.
		 */

		/**
		 * 정적 팩토리를 제공하면서 생성자를 제공하는 경우
		 * ArrayList
		 */

		List<Integer> list = new ArrayList<>(); // 생성자
		List<Integer> list2 = List.of(1,2,3,4); // 정적 팩토리 메서드를 사용한 것

		System.out.println(list2);

		/**
		 * 정적 팩터리 메서드는 개발자가 찾기 어렵습니다.
		 * 따라서 헷갈리지 않도록 명명규칙을 사용해야합니다.
		 *
		 * from : 매개 변수 하나를 받아서 해당 타입의 인스턴스를 반환하는 형변환 메서드
		 * Date d = Date.from(instant);
		 * of : 여러 매개변수를 받아 적합한 타입의 인스턴스를 반환하는 집계 메서드
		 * Set faceCards = EnumSet.of(JACK, QUEEN, KING);
		 * valueOf : from 과 of의 더 자세한 버전
		 * BigInteger prime = BinInteger.valueOf(Integer.MAX_VALUE);
		 * instance 혹은 getInstance : (매개변수를 받는다면) 매개변수로 명시한 인스턴스를 반환하지만, 같은 인스턴스임을 보장하지는 않는다.
		 * StackWalker luke = StackWalker.getInstance(options);
		 * create 혹은 newInstance : instance 혹은 getInstance 같지만, 매번 새로운 인스턴스를 생성해 반환함을 보장한다.
		 * Object newArray = Array.newInstance(classObject, arrayLen);
		 * getType : getInstance 와 같으나, 생성할 클래스가 아닌 다른 클래스에 팩터리 메서드를 정의할 떄 쓴다. "Type" 은 팩터리 메서드가 반환할 객체의 타입이다.
		 * FileStore fs = Files.getFileStore(path);
		 * newType: newInstance 와 같으나, 생성할 클래스가 아닌 다른 클래스에 팩터리 메서드를 정의할 떄 쓴다. "Type" 은 팩터리 메서드가 반환할 객체의 타입이다.
		 * BufferedReader br = Files.newBufferedReader(path);
		 * type : getType과 newType의 간결한 버전
		 * List litany = Collections.list(legacyLitany)
		 */
	}

}
