package org.example.chapter2.item9;

public class Resource1{

	public void play() throws Error1{
		System.out.println("Resource1 play");
		throw new Error1();
	}

	public void close() throws Error2{
		System.out.println("Resource1 close");
		throw new Error2();
	}
}
