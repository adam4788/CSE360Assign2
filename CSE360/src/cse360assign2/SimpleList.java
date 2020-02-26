package cse360assign2;

/*Author:	Adam Nugroho
Class Id:	109
Assignment#:1
Description: Simple list class with methods to manipulate the int array of 10  
*/
import java.util.Arrays;

public class SimpleList {

	private int[] list;
	private int count;

	/**
	 * Constructor method
	 */
	public SimpleList() {
		list = new int[10];
		count = 0;
	}

	/**
	 * This method adds an element
	 * 
	 * @param x is the element to be added
	 */
	public void add(int number) {
		if (count == list.length) {
			int[] temp = new int[(int) (list.length * 1.5)];
			for (int increment = 0; increment < list.length; increment++) {
				temp[increment] = list[increment];
			}
			list = temp;
		}
		for (int increment = list.length - 1; increment > 0; increment--) {
			list[increment] = list[increment - 1];
		}
		list[0] = number;
		count++;
	}

	/**
	 * This method removes an element and shift the other element to the left
	 * 
	 * @param number is the element to be removed
	 */
	public void remove(int number) {
		if (count < list.length * 0.75) {
			int[] temp = new int[(int) (list.length * 0.75)];
			for (int increment = 0; increment < list.length; increment++) {
				temp[increment] = list[increment];
			}
			list = temp;
		}
		int location = search(number);
		if (location != -1) {
			for (int increment = 0; increment < list.length - 1; increment++) {
				if (increment >= location) {
					list[increment] = list[increment + 1];
				}
			}
			count--;
		}
	}

	/**
	 * Count getter
	 * 
	 * @return count
	 */
	public int count() {
		return count;
	}

	/**
	 * to String method
	 */
	public String toString() {
		String output = "";
		for (int element : list) {
			if (element != 0) {
				output += element;
				output += " ";
			}
		}
		return output.substring(0, output.length() - 1);
	}

	/**
	 * This method search for an element
	 * 
	 * @param x is the element to be searched
	 * @return the location of the element, or -1 if not found
	 */
	public int search(int number) {
		int location = -1;
		for (int increment = 0; increment < list.length - 1; increment++) {
			if (list[increment] == number) {
				location = increment;
			}
		}
		return location;
	}

}
