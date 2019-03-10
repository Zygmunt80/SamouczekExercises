package part19EnumExercise;

public class Main {
		
	public static void main(String[] args) {
		Human human = new Human("Tom", 33, EyesColour.BROWN, HairColour.BROWN);
		System.out.println(human.getName() + "\n" + human.getAge() + "\n" + human.getEyesColour());
		
	}
}	