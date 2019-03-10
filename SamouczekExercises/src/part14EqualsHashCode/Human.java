package part14EqualsHashCode;

public class Human {
	private String name;
	private String surname;
	private int pesel;
	
	public Human(String name, String surname, int pesel) {
		this.name = name;
		this.surname = surname;
		this.pesel = pesel;
		
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public int getPesel() {
		return pesel;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj instanceof Human) {
			Human newHuman = (Human) obj;
			return name.equals(newHuman.name) && surname.equals(newHuman.surname) && pesel == newHuman.pesel;
		} else {
			return false;
		}		
	}
	
	@Override
	public int hashCode() {
		return 7*pesel + 5*name.hashCode() + 9*surname.hashCode();
	}	
}
