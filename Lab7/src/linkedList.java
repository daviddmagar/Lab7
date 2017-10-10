/**
 * CS 2003 - Lab 7
 * Lab project working with linked lists, insertion, removal, and deep copying
 *
 * @author David Magar
 * @version 1.0
 * @since 10-10-2017
 */

import java.util.LinkedList;
import java.util.ListIterator;

public class linkedList {

	public static void main(String[] args) {
		//Create linked lists
		LinkedList<String> cities = new LinkedList<String>();
		LinkedList<String> list2 = new LinkedList<String>();
		LinkedList<String> deepCopy = new LinkedList<String>();
		
		//Add cities to linked lists
		cities.add("Tulsa");
		cities.add("Ada");
		cities.add("Broken Arrow");
		cities.add("Owasso");
		System.out.println(cities);
		
		//Add OKC to second element of the linked list
		cities.add(1, "OKC");
		System.out.println(cities);

		//Add elements to 2nd list
		list2.add("74104");
		list2.add("74135");
		list2.add("foo");
		list2.add("hello world");
		list2.add("777");

		System.out.println(list2);

		//Merge list one and two
		cities.addAll(list2);
		System.out.println(cities);
		
		//Create list iterator
		ListIterator<String> citiesIter = cities.listIterator();

		//Step into first element of the linked list
		citiesIter.next();

		//The next comment is in regards to my while loop
		//Iterates through list deleting every other element
		while (citiesIter.hasNext()) {
			citiesIter.next();
			citiesIter.remove();
			if(citiesIter.hasNext())
			{
				citiesIter.next();
			}
			else
				break;
		}
		
		//The following comment is a comment about my deep copy method
		//Iterates through first list and creates a new element in a second element
		for(int x = 0; x < cities.size(); x++) {
			deepCopy.add(cities.get(x));
		}
		System.out.println(deepCopy);
	}
}

