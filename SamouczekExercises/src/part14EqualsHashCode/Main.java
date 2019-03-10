package part14EqualsHashCode;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human newHuman1 = new Human("Tom", "Johns", 1984);
		Human newHuman2 = new Human("Tom", "Nowak", 1984);
		Human newHuman3 = new Human("Adrian", "Johns", 1984);
		Human newHuman4 = new Human("tom", "Johns", 1984);
		Human newHuman5 = new Human("Tom", "Johns", 1988);
		Human newHuman6 = new Human("Tom", "Johns", 1984);
		
		System.out.println("human1 equals human2: " + newHuman1.equals(newHuman2));
		System.out.println("human1 equals human3: " + newHuman1.equals(newHuman3));
		System.out.println("human1 equals human4: " + newHuman1.equals(newHuman4));
		System.out.println("human1 equals human5: " + newHuman1.equals(newHuman5));
		System.out.println("human1 equals human6: " + newHuman1.equals(newHuman6));
		System.out.println("human1 equals null: " + newHuman1.equals(null));
		
		/*
		Recursion recursion = new Recursion();
		recursion.recursionMethod();
		*/

	}

}
