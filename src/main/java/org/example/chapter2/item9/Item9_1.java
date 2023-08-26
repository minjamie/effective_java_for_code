package org.example.chapter2.item9;

public class Item9_1 {

	public static void main(String[] args) {
		// 누적으로 예외를 확인할 수 있다.

		//try - finally
		Resource1 resource1 = new Resource1();
//
		try {
			// 예외 1 발생
			resource1.play();
		} finally {
			// 예외 2 발생
			try {
				resource1.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}



//		//try - with - resource
//		try (Resource2 resource2 = new Resource2()) {
//			resource2.play();
//		}

	}
}