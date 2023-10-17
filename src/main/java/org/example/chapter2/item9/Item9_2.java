package org.example.chapter2.item9;

public class Item9_2 {

	public static void main(String[] args) throws Exception {
		// 코드 복장성의 감소로 가독성이 좋아진다.

		// try finally
//		Resource1 resource1_1 = new Resource1();
//		Resource1 resource1_2 = new Resource1();
//
//		try {
//			resource1_1.play();
//			try {
//				resource1_2.play();
//			} finally {
//				resource1_2.close();
//			}
//		} finally {
//			resource1_1.close();
//		}

		//try - with - resource

		try (
			Resource2 resource2_1 = new Resource2();
			Resource2 resource2_2 = new Resource2()
			) {
			resource2_1.play();
			resource2_2.play();
			}


	}
}
