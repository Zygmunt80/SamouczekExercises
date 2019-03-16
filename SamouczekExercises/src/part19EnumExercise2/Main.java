package part19EnumExercise2;

import java.util.Scanner;

public class Main {
	
	Scanner scan = new Scanner(System.in);
	double number1 = 0;
	double number2 = 0;
	String operation;
	Computation comp;
	
	public void startOne() {
		System.out.println("czy chcesz wykonaæ diza³anie? y/n");
		String yesNo = scan.nextLine();
		if (yesNo.equals("y")) {
			System.out.println("Jakie diza³anie chcesz wykonaæ +, -, /, *");
			operation = scan.nextLine();
			
			System.out.println("podaj pierwsz¹ liczbê");
			number1 = userInput();
			System.out.println("podaj drug¹ liczbê");
			number2 = userInput();
			System.out.println(calculate(number1, number2, comp));
		} else {
			System.out.println("Dziêkujê z wspó³pracê");
		}
	}
	
	public double userInput() {
		return scan.nextDouble();
	}
		
		public double calculate(double number1, double number2, Computation comp) {
			this.number1 = number1;
			this.number2 = number2;
			this.comp = comp;
			return Computation.SUBTRACT.perform(number1, number2);
		}
	public static void main(String[] args) {
		
		Main newOne = new Main();
		newOne.startOne();
		
		//System.out.println("5 - 12,5 = " + Computation.SUBTRACT.perform(5.0, -4.5));		
	}
}
