package part6Primitives;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] grades = new double[3][4];
		grades[0][0] = 3;
		grades[0][1] = 4;
		grades[0][2] = 4.5;
		grades[0][3] = 3.5;
		grades[1][0] = 4;
		grades[1][1] = 4.5;
		grades[1][2] = 4.5;
		grades[1][3] = 5.5;
		grades[2][0] = 2;
		grades[2][1] = 2.5;
		grades[2][2] = 3;
		grades[2][3] = 2.5;

		double average1 = 0;
		double average2 = 0;
		double average3 = 0;

		for (int i = 0; i < grades.length; i++) {
			for (int j = 0; j < grades[i].length; j++) {
				switch (i) {
				case 0:
					average1 = average1 + grades[0][j] / grades[0].length;
					break;
				case 1:
					average2 = average2 + grades[1][j] / grades[0].length;
					break;
				case 2:
					average3 = average3 + grades[2][j] / grades[0].length;
				}
			}
		}
		System.out.println("average grade 1 = " + average1 + "\n");
		System.out.println("average grade 2 = " + average2 + "\n");
		System.out.println("average grade 3 = " + average3);
	}
}
