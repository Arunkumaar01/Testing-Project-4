package org.comp;

public class DeskTop extends Computer {
	private void name() {
		System.out.println("apple");
	}
	public static void main(String[] args) {
		DeskTop desk=new DeskTop();
		desk.name();
		desk.typesOfComputer();
	}

}
