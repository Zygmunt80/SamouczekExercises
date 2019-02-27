package part5LoopsAndStatements;

public class Exercise5 {
	
	public int sumArray(int[] thisArray) {
		int sum=0;		
		for (int i = 0; i < thisArray.length; i++) {
			sum = sum + thisArray[i];
		}				
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arrayExample = new int[] {3, 5, 22, 11};
		Exercise5 summy = new Exercise5();
		System.out.println(summy.sumArray(arrayExample));
		
	}
}
