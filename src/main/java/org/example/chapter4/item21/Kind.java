package org.example.chapter4.item21;

public interface Kind {
	
	// 친절함

	default int division(int a, int b) {
		if (b == 0) {
			System.out.println("0으로는 나눌 수 없어요!");

			return 0;
		}

		return a/b;
	}

}
