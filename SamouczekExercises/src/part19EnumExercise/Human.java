package part19EnumExercise;

public class Human {
	private String name;
	private int age;
	private EyesColor eyesColor;
	private HairColor hairColor;
	
	public Human(String name, int age, EyesColor eyesColor, HairColor hairColor) {
		super();
		this.name = name;
		this.age = age;
		this.eyesColor = eyesColor;
		this.hairColor = hairColor;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public EyesColor getEyesColor() {
		return eyesColor;
	}

	public HairColor getHairColor() {
		return hairColor;
	}
	
	

}
