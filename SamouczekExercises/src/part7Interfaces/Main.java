package part7Interfaces;

import java.util.Scanner;

public class Main {

	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Main main = new Main();
		Computation computation;

		if (main.shouldMultiply()) {
			computation = new Multiplication(); // zaimplementuj brakuj�c� klas�
		} else {
			computation = new Addition(); // zaimplementuj brakuj�c� klas�
		}

		double argument1 = main.getArgument();
		double argument2 = main.getArgument();

		double result = computation.compute(argument1, argument2);
		System.out.println("Wynik: " + result);
	}

	private boolean shouldMultiply() {
		System.out.println("If you want multiply type '1'");
		int question;
		question = scan.nextInt();
		if (question == 1) {
			return true;
		} else {
			return false; // tutaj zapytaj u�ytkownika co chce zrobi� (mno�enie czy dodawanie)
		}
	}

	private double getArgument() {
		System.out.println("Type number please");
		double argument = scan.nextDouble();
		return argument; // tutaj pobierz liczb� od u�ytkownika
	}
}
