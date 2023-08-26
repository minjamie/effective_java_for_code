package org.example.chapter4.item21;

public class Child extends Mother implements Father {

//	@Override
//	public void gene() {
//		Father.super.gene();
//	}

	public static void main(String[] args) {

		Child child = new Child();
		child.gene();
	}
}
