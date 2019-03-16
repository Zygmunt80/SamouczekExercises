package collections;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class UniqueNames {

	Scanner scan = new Scanner(System.in);
	Set<String> list = new HashSet<>();

	public void userNames() {
		System.out.println("Type some name. If you want to end typying names and show all names type '-'");
		String name = scan.nextLine();
		if (!name.equals("-")) {
			list.add(name);
			userNames();
		} else {
			for (String item : list) {
				System.out.println(item);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniqueNames start = new UniqueNames();
		start.userNames();
	}
}
