package org.example.chapter1.item1_2;

public class Server {

	/**
	 * 어디서나 동일한 값으로 사용하는 클래스에대해서 인스턴스 생성을 막을 수 있습니다.
	 * 정적 팩터리 메서드를 사용하면 매번 새로운 인스턴스를 새로 생성하지 않아도 됩니다.
	 */

	private boolean open;

	private Server() {}

	private static final Server SERVER = new Server();

	public static Server getInstance() {
		return SERVER;
	}
}
