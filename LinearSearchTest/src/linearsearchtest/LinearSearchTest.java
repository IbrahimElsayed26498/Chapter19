/*
In the name of Allah, the Gracious, the Merciful
 */
package linearsearchtest;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ibrahim
 */
public class LinearSearchTest {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		SecureRandom generator = new SecureRandom();
		
		int[] data = new int [10];
		
		for(int i = 0; i < data.length; i++){
			data[i] = 10 + generator.nextInt(90);
		}
		
		System.out.printf("%s%n%n", Arrays.toString(data));
		
		// get input from user
		System.out.print("Please enter an integer value (-1 to quit) : ");
		int searchInt = input.nextInt();
		
		while(searchInt != -1){
			int position = linearSearch(data, searchInt);
			
			if(position == -1) // not found
				System.out.println(searchInt + " was not found\n");
			else
				System.out.printf("%d was found in position %d%n%n",
						searchInt, position);
			
			
			// get input from user
			System.out.print("Please enter an integer value (-1 to quite) : ");
			searchInt = input.nextInt();
		}
	}
	
	public static int linearSearch(int[] data, int seachKey){
		for(int index = 0; index < data.length; index++){
			if(data[index] == seachKey)
				return index;
		}
		return -1;
	}
	
}
