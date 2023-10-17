package org.example.chapter1.item1_2;

public interface RockScissorPaper {

	String something();

	static RockScissorPaper of(String type) {
		if (type.equals("ROCK")) {
			return new PaperService();
		} else if (type.equals("PAPER")) {
			return new ScissorService();
		} else {
			return new RockService();
		}
	}
}
