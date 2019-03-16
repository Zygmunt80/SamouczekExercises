package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.sun.javafx.collections.MappingChange.Map;

public class Pairs {

	public Scanner scan = new Scanner(System.in);
	public HashMap<String, String> pairs = new HashMap<>();
	public static boolean end = false;

	public String userInput() {
		return scan.nextLine();
	}

	public void printPairs() {
		for (String key : pairs.keySet()) {
			String value = pairs.get(key);
			System.out.println(key + " : " + value);
		}
	}

	public void addName(String name1, String name2) {
		pairs.put(name1, name2);
	}

	public void general() {
		System.out.println("podaj pierwsze imiê pary");
		String name1 = userInput();
		System.out.println("podaj drugiê imiê pary");
		String name2 = userInput();
		if (name1.equals("-") || name2.equals("-")) {
			printPairs();
		} else {
			addName(name1, name2);
			general();
		}
	}

	public static void main(String[] args) {
		Pairs newPairs = new Pairs();
		newPairs.general();
	}
}
