package collections;

import java.awt.*;
import java.awt.List;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> pairsMap = new HashMap<>();
		pairsMap.put("Marcin", "Adela");
		pairsMap.put("Marek", "Magda");
		 
		Map<String, String> otherPairsMap = new HashMap<>();
		otherPairsMap.put("Marek", "Ewa");
		otherPairsMap.put("Adam", "Ewa");
		otherPairsMap.put("Marek1", "Ewa1");
		otherPairsMap.put("Adam1", "Ewa1");
				 
		pairsMap.putAll(otherPairsMap);
		
		System.out.println("Iterowanie po wartosciach");
		for(String value : otherPairsMap.values()) {
		    System.out.println(value);
		}
		
		System.out.println("Iterowanie po kluczach i pobieranie wartosci");
		for(String key : otherPairsMap.keySet()) {
		    String value = otherPairsMap.get(key);
		    System.out.println(key + ": " + value);
		}
		
		System.out.println("Iterowanie po kluczach i wartosciach");
		for(Map.Entry<String, String> entry : otherPairsMap.entrySet()) {
		    String key = entry.getKey();
		    String value = entry.getValue();
		    System.out.println(key + ": " + value);
		}
		/*
		System.out.println(pairsMap.get("Marek"));
		System.out.println(pairsMap.remove("Marek"));
		System.out.println(pairsMap.size());
		System.out.println(pairsMap.isEmpty());
		System.out.println(pairsMap.containsKey("Jan"));
		System.out.println(pairsMap.containsValue("Adela"));
		*/
	}
}
