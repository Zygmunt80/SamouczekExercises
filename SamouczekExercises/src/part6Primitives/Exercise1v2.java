package part6Primitives;

import java.util.Scanner;

public class Exercise1v2 {

	private final int classessNumber = 3;
	private final int notesNumber = 4;
	private double[][] diary = new double[classessNumber][notesNumber];
	Scanner scan = new Scanner(System.in);

	private void getNotes() {
		for (int i = 0; i < classessNumber; i++) {
			for (int j = 0; j < notesNumber; j++) {
				System.out.println("type please note number " + (j+1) + " for class number " + (i+1));
				diary[i][j] = scan.nextDouble();
			}
		}
	}

	private void answer() {
		double average = 0;
		for (int i = 0; i < classessNumber; i++) {			
			for (int j = 0; j < notesNumber; j++) {
				average += diary[i][j] / notesNumber;
				if (j == notesNumber-1) {
					System.out.println("average grade from class number " + (i+1) + " = " + average);
					average = 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise1v2 exercise = new Exercise1v2();
		exercise.getNotes();
		exercise.answer();
	}
}