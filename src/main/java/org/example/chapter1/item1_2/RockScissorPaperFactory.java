package org.example.chapter1.item1_2;

public class RockScissorPaperFactory {

	/**
	 * 입력 매개변수에 따라 매번 다른 클래스의 객체를 반환할 수 있습니다.
	 * 이렇게 사용하면 반환타입에 호환 가능한 다른 타입의 인스턴스들을 반환할 수 있습니다.
	 */

	public static RockScissorPaper of(String type) {
		if (type.equals("ROCK")) {
			return new PaperService();
		} else if (type.equals("PAPER")) {
			return new ScissorService();
		} else {
			return new RockService();
		}
	}

}
