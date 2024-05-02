package _00_intro_to_array_lists;

import java.util.*;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
		ArrayList<String> lol = new ArrayList<String>();
		//2. Add five Strings to your list
		for(int j = 0; j <5; j++) {
			lol.add(j+"");
		}
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i <5; i++) {
			System.out.println(lol.get(i));
		}
		//4. Print all the Strings using a for-each loop
		for(String k : lol) {
			System.out.println(k);
		}
		//5. Print only the even numbered elements in the list.
		for(int i = 0; i <5; i++) {
			if(i%2 == 0) {
			System.out.println(lol.get(i));
			}
		}
		//6. Print all the Strings in reverse order.
		for(int i = 4; i >-1; i--) {
			if(i%2 == 0) {
			System.out.println(lol.get(i));
			}
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for(int i = 0; i <5; i++) {
			if(lol.contains("e")) {
				System.out.println(lol.get(i));
			}
		}
	}
}
