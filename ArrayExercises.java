package com.perscholas.java_basics.exercises;

import java.util.Arrays;

public class ArrayExercises {

	public static void main(String[] args) {
		/* 1.
		 * Write a program that creates an array of integers with a length of 3. 
		 * Assign the values 1, 2, and 3 to the indexes. Print out each array element.
		 * */
		System.out.println("----------- 1. -----------");
		int[] arr1 = {1, 2, 3};
		for(int num : arr1) {
			System.out.println(num);
		}
		
		
		/* 2.
		 * Write a program that returns the middle element in an array. 
		 * Give the following values to the integer array: {13, 5, 7, 68, 2} and produce the following output: 7
		 */
		System.out.println("----------- 2. -----------");
		int[] arr2 = {13, 5, 7, 68, 2};
		System.out.println(arr2[arr2.length/2]);
		
		
		/* 3.
		 * Write a program that creates an array of String type and initializes it with the strings “red”, 
		 * “green”, “blue” and “yellow”. Print out the array length. Make a copy using the clone( ) method. 
		 * Use the Arrays.toString( ) method on the new array to verify that the original array was copied.
		 */
		System.out.println("----------- 3. -----------");
		String[] strArray3 = {"red", "green", "blue" , "yellow"};
		System.out.println(strArray3.length);
		String[] newArray3 = strArray3.clone();
		System.out.println(Arrays.toString(newArray3));
		
		
		/* 4.
		 * Write a program that creates an integer array with 5 elements (i.e., numbers). The numbers can be any integers.  
		 * Print out the value at the first index and the last index using length - 1 as the index. 
		 * Now try printing the value at index = length ( e.g., myArray[myArray.length ] ).  
		 * Notice the type of exception which is produced. Now try to assign a value to the array index 5. 
		 * You should get the same type of exception.
		 */
		System.out.println("----------- 4. -----------");
		int[] arr4 = {6, 76, 3, 2, 24};
		System.out.println(arr4[0]);
		System.out.println(arr4[arr4.length-1]);
		//System.out.println(arr4[arr4.length]);
		//arr4[5] = 123;
		
		

		/* 5.
		 * Write a program where you create an integer array with a length of 5. Loop through the array and assign the 
		 * value of the loop control variable (e.g., i) to the corresponding index in the array.
		 */
		System.out.println("----------- 5. -----------");
		int[] arr5 = new int[5];
		for(int i = 0; i < arr5.length; i++) {
			arr5[i] = i;
		}
		System.out.println(Arrays.toString(arr5));
		
		
		/* 6.
		 * Write a program where you create an array of 5 elements. Loop through the array and print the value of 
		 * each element, except for the middle (index 2) element.
		 */
		System.out.println("----------- 6. -----------");
		int[] arr6 = new int[5];
		for(int i = 0; i < arr5.length; i++) {
			arr6[i] = i * 2;
		}
		System.out.println(Arrays.toString(arr6));
		
		
		/* 7.
		 * Write a program where you create an array of 5 elements. Loop through the array and print the value of 
		 * each element, except for the middle (index 2) element.
		 */
		System.out.println("----------- 7. -----------");
		int[] arr7 = {83, 8, 56, 1, 33};
		for(int i = 0; i < arr7.length; i++) {
			if(i != arr7.length/2) {
				System.out.println(arr7[i]);
			}
		}
		
		
		/* 8.
		 * Write a program that creates a String array of 5 elements and swaps the first element with 
		 * the middle element without creating a new array.
		 */
		System.out.println("----------- 8. -----------");
		String[] strArray8 = {"one" , "two" , "three" , "four" , "five"};
		String tempStr = strArray8[0];
		strArray8[0] = strArray8[strArray8.length/2];
		strArray8[strArray8.length/2] = tempStr;
		System.out.println(Arrays.toString(strArray8));
		
		
		/* 9.
		 * Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}. 
		 * Print the array in ascending order, print the smallest and the largest element of the array. 
		 * The output will look like the following:
		 * Array in ascending order: 0, 1, 2, 4, 9, 13
		 * The smallest number is 0
		 * The biggest number is 13
		 */
		System.out.println("----------- 9. -----------");
		int[] arr9 = {4, 2, 9, 13, 1, 0};
		for(int i = 0; i < arr9.length; i++) {
			for(int k = 0; k < arr9.length-1; k++) {
				if(arr9[k] > arr9[k+1]) {
					int temp = arr9[k];
					arr9[k] = arr9[k+1];
					arr9[k+1] = temp;		
				}
			}
		}
		System.out.println(Arrays.toString(arr9));
		System.out.println(arr9[0]);
		System.out.println(arr9[arr9.length-1]);
		
		
		/* 10.
		 * Create an array that includes an integer, 3 strings, and 1 double. Print the array.
		 */
		System.out.println("----------- 10. -----------");
		Object[] objArray10 = {43 , "user" , "large" , "t-18r" , 67.22};
		System.out.println(Arrays.toString(objArray10));
	}
}
