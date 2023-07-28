package org.example.chapter2.item9;

public class Resource2 implements AutoCloseable{

	public void play() throws Error1{
		System.out.println("Resource2 play");
		throw new Error1();
	}

	@Override
	public void close() throws Error2 {
		System.out.println("Resource2 close");
		throw new Error2();
	}

}
