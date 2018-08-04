//java program to imply grep command of unix
package com.fileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GrepApplication {
	public static void main(String args[]) throws FileNotFoundException {
		int count = 0, notFound = 0;
		File file = new File("P:\\Users\\manasab\\Desktop\\manu.txt");

		Scanner scanner = new Scanner(System.in);
		Scanner input = new Scanner(file);

		System.out.println("Enter the search string");
		String name = scanner.nextLine();
		
		// iterate till there is next line
		
		while (input.hasNextLine()) {
			// reads next line
			String line = input.nextLine();
			// checks if the current line has that name
			if (line.contains(name)) {
				count++;
				System.out.println("String " + name + " occurs at line" + count);

			} else {
				count++;
				notFound++;
			}
		}
		// if string is not in that file
		if (count == notFound)
			System.out.println("String " + name + " not found");
	}

}
