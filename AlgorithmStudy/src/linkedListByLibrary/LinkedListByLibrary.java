package linkedListByLibrary;

import java.util.LinkedList;

public class LinkedListByLibrary {
	
	public static void main(String[] args) {
	
		LinkedList<String> colors = new LinkedList<>();
		
		// add
		colors.add("Black");
		colors.add("White");
		colors.add(0, "Green");
		colors.add("Red");
		
		// set()
		colors.set(0, "Blue");
		
		System.out.println(colors);
		
//		String removedColor = colors.remove(0);
//		System.out.println("Removed color is " + removedColor);
		
//		colors.remove("White");
		colors.remove();
		System.out.println(colors);
		
		colors.clear();
		System.out.println(colors);
	
	}

}
