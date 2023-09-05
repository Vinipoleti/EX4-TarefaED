package view;

import java.util.Scanner;

import Controller.ConverteController;

public class Principal {

	public static void main(String[] args) {
		ConverteController CC = new ConverteController();
		Scanner SC = new Scanner(System.in);
		int decimal = SC.nextInt();
		
		while (decimal>1000 ) {
			System.out.println("a");
			decimal = SC.nextInt();
		}
		SC.close();
		
		System.out.println(CC.decToBin(decimal));
		

	}

}
