package part7Interfaces;

public class Multiplication implements Computation {

	@Override
	public double compute(double argument1, double argument2) {
		double multiplicationResult = argument1 * argument2;		
		return multiplicationResult;
	}
}
