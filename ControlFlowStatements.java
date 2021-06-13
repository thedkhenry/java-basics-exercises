package com.perscholas.java_basics.exercises;

import java.util.Scanner;

public class ControlFlowStatements {

	public static void main(String[] args) {
		/* 1.
		 * Write a program that declares 1 integer variable x, and then assigns 7 to it. 
		 * Write an if statement to print out “Less than 10” if x is less than 10. 
		 * Change x to equal 15 and notice the result (console should not display anything).
		*/
		int x1 = 15;
		if(x1 < 10) {
			System.out.println("Less than 10");
		}
		
		
		/* 2.
		 * Write a program that declares 1 integer variable x, and then assigns 7 to it. 
		 * Write an if-else statement that prints out “Less than 10” if x is less than 10 and 
		 * “Greater than 10” if x is greater than 10. Change x to 15 and notice the result.
		*/ 
		int x2 = 15;
		if(x2 < 10) {
			System.out.println("Less than 10");
		}
		else if(x2 > 10) {
			System.out.println("Greater than 10");
		}
		
		
		/* 3.
		 * Write a program that declares 1 integer variable x, and then assigns 15 to it. 
		 * Write an “if-else-if” statement that prints out “Less than 10” if x is less than 
		 * 10, “Between 10 and 20” if x is greater than 10 but less than 20, and “Greater than or 
		 * equal to 20” if x is greater than or equal to 20. Change x to 50 and notice the result.
		*/
		int x3 = 50;
		if(x3 < 10) {
			System.out.println("Less than 10");
		}else if(x3 > 10 && x3 < 20) {
			System.out.println("Between 10 and 20");
		}else {
			System.out.println("Greater than 20");
		}
		
		
		/* 4.
		 * Write a program that declares 1 integer variable x, and then assigns 15 to it. 
		 * Write an if-else statement that prints “Out of range” if the number is less than 10 or 
		 * greater than 20 and prints “In range” if between 10 and 20 (including equal to 10 or 20). 
		 * Change x to 5 and notice the result.
		*/
		int x4 = 5;
		if(x4 < 10 || x4 > 20) {
			System.out.println("Out of range");
		}else if(x4 > 10 && x4 < 20){
			System.out.println("In range");
		}
		
		
		/* 5.
		 * Write a program that uses if-else-if statements to print out grades A, B, C, D, F according to the following criteria:
		 * A: 90-100
		 * B: 80-89
		 * C: 70-79
		 * D: 60-69
		 * F: <60
		 * Use the Scanner class to accept a number score from the user to determine the
		 * letter grade. Print out “Score out of range.” if the score is less than 0 or
		 * greater than 100.
		 */
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if(num < 0 || num > 100) {
			System.out.println("Score out of range.");
		}else if(num >= 90 && num < 100) {
			System.out.println("A");
		}else if(num >= 80 && num < 89) {
			System.out.println("B");
		}else if(num >= 70 && num < 79) {
			System.out.println("C");
		}else if(num >= 60 && num < 69) {
			System.out.println("D");
		}else{
			System.out.println("F");
		}
		
		
		/* 6.
		 * Write a program that accepts an integer between 1 and 7 from the user. Use a
		 * switch statement to print out the corresponding weekday. Print “Out of range”
		 * if the number is less than 1 or greater than 7. Don’t forget to include
		 * “break” statements in each of your cases.
		 */
		num = scan.nextInt();
		String day;
		switch(num) {
			case 1: day = "Sunday"; break;
			case 2: day = "Monday"; break;
			case 3: day = "Tuesday"; break;
			case 4: day = "Wednesday"; break;
			case 5: day = "Thursday"; break;
			case 6: day = "Friday"; break;
			case 7: day = "Saturday"; break;
			default: day = "Out of range"; break;
		}
		System.out.println(day);
		scan.close();
	}
}