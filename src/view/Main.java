package view;

import controller.ThreadGetID;

public class Main {

	public static void main(String[] args) {
	
		for (int i = 0; i < 5; i++) {
			ThreadGetID getId = new ThreadGetID();
			getId.start();
			
		}
	}

}
