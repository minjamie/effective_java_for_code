package org.example.chapter4.item21;

public interface Father {

	default void gene() {
		System.out.println("Father.gene");
	}

}
