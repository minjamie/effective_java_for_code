package org.example.chapter1.item1_2;

public class DetailSetting {

	/**
	 * 단점 상속을 하려면 생성자가 public, protected 정적 팩터리 메서드만 제공하면 하위 클래스를 만들 수 없습니다.
	 * 하지만 아래와 같이 우회해서 사용할 수 있고,
	 * Server를 사용하면 굳이 상속을 받지 않아도 Server의 기능을 사용할 수 있으니 오히려 장점이 될 수 있습니다.
	 */

	Server server;

}
