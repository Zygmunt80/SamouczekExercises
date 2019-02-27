package part5LoopsAndStatements;

public class Exercise6 {

	public int sumArray(int[][] thisArray) {
		int sum=0;		
		for (int i = 0; i < thisArray.length; i++) {
			for (int j = 0; j < thisArray[i].length; j++)
			sum = sum + thisArray[i][j];
		} 
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arrayExample = new int[][] {{3, 5, 22}, {8, -5, -12}, {-8, 15, 21}};
		Exercise6 summy = new Exercise6();
		System.out.println(summy.sumArray(arrayExample));		
	}
}

