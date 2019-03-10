package part19EnumExercise;

public class Main {
	static Human human = new Human("Tom", 33, EyesColor.BROWN, HairColor.BROWN);
	
	public static void main(String[] args) {
		System.out.println(human.getName() + "\n" + human.getAge() + "\n" + human.getEyesColor());
		
	}
}	