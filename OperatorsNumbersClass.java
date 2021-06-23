package com.perscholas.java_basics.exercises;

public class OperatorsNumbersClass {

	public static void main(String[] args) {
		/* 1.
		 * Write the following integers in binary notation. Do not use any Java
		 * functions or online conversion applications to calculate the answer as this
		 * will hinder the learning process and your understanding of the concept.
		 * However, you may check your answers using Java methods. 
		 * 1 
		 * 8 
		 * 33 
		 * 78 
		 * 787 
		 * 33,987
		 */
		System.out.println("----------- 1. -----------");
		// 1 = 1
		// 8 = 1000
		// 33 = 0010 0001
		// 78 = 0100 1110
		// 787 = 0011 0001 0011
		// 33,987 = 1000 0100 1100 0011
		
		
		/* 2.
		 * Convert the following binary numbers to decimal notation. Do not use any Java
		 * functions or online conversion applications to calculate the answer as this
		 * will hinder the learning process and your understanding of the concept.
		 * However, you may check your answers using Java methods. 
		 * 0010 
		 * 1001 
		 * 0011 0100
		 * 0111 0010 
		 * 0010 0001 1111 
		 * 0010 1100 0110 0111
		 */
		System.out.println("----------- 2. -----------");
		// 0010 = 2
		// 1001 = 9
		// 0011 0100 = 52
		// 0111 0010 = 114
		// 0010 0001 1111 = 543
		// 0010 1100 0110 0111 = 11367
				
		
		/* 3.
		 * Write a program that declares an integer a variable x and assigns the value 2
		 * to it and prints out the binary string version of the number (
		 * Integer.toBinaryString(x) ). Now, use the left shift operator (<<) to shift
		 * by 1 and assign the result to x. Before printing the results, write a comment
		 * with the predicted decimal value and binary string. Now, print out x in
		 * decimal form and in binary notation. 
		 * Do the preceding exercise with the following values:
		 * 9 
		 * 17 
		 * 88
		 */
		System.out.println("----------- 3. -----------");
		int x = 2;
		System.out.println(x + " = " + Integer.toBinaryString(x));
		x <<= 1;
		// 4
		// 0100
		System.out.println("Left shifted: " + x + " " + Integer.toBinaryString(x));		
		
		x = 9;
		System.out.println(x + " = " + Integer.toBinaryString(x));
		x <<= 1;
		// 18
		// 0001 0010
		System.out.println("Left shifted: " + x + " " + Integer.toBinaryString(x));
		
		x = 17;
		System.out.println(x + " = " + Integer.toBinaryString(x));
		x <<= 1;
		// 34
		// 0010 0010
		System.out.println("Left shifted: " + x + " " + Integer.toBinaryString(x));
		
		x = 88;
		System.out.println(x + " = " + Integer.toBinaryString(x));
		x <<= 1;
		// 176
		// 1011 0000
		System.out.println("Left shifted: " + x + " " + Integer.toBinaryString(x));
		
		
		/* 4.
		 * Write a program that declares a variable x and assigns 150 to it and prints
		 * out the binary string version of the number. Now use the right shift operator
		 * (>>) to shift by 2 and assign the result to x. Write a comment indicating
		 * what you anticipate the decimal and binary values to be. Now print the value
		 * of x and the binary string. 
		 * Do the preceding exercise with the following values:
		 * 225 
		 * 1555 
		 * 32456
		 */
		System.out.println("----------- 4. -----------");
		int xx = 150;
		System.out.println(xx + " = " + Integer.toBinaryString(xx));
		xx >>= 2;
		// 37
		// 0010 0101
		System.out.println("Right shifted: " + xx + " " + Integer.toBinaryString(xx));
		
		xx = 225;
		System.out.println(xx + " = " + Integer.toBinaryString(xx));
		xx >>= 2;
		// 56
		// 0011 1000
		System.out.println("Right shifted: " + xx + " " + Integer.toBinaryString(xx));
		
		xx = 1555;
		System.out.println(xx + " = " + Integer.toBinaryString(xx));
		xx >>= 2;
		// 388
		// 0001 1000 0100
		System.out.println("Right shifted: " + xx + " " + Integer.toBinaryString(xx));

		xx = 32456;
		System.out.println(xx + " = " + Integer.toBinaryString(xx));
		xx >>= 2;
		// 8114
		// 0001 1111 1011 0010
		System.out.println("Right shifted: " + xx + " " + Integer.toBinaryString(xx));
		
		
		/* 5.
		 * Write a program that declares 3 int variables x, y, and z. Assign 7 to x and
		 * 17 to y. Write a comment that indicates what you predict will be the result
		 * of the bitwise & operation on x and y. Now use the bitwise & operator to
		 * derive the decimal and binary values and assign the result to z. 
		 * 
		 * Now, with the preceding values, use the bitwise | operator to calculate the “or” value
		 * between x and y. As before, write a comment that indicates what you predict
		 * the values to be before printing them out.
		 */
		System.out.println("----------- 5. -----------");
		int xxx = 7; // 0 0111
		int yyy = 17;// 1 0001
		// 7 & 17  -->  0 0001
		int zzz = xxx & yyy;
		System.out.println("result: " + Integer.toBinaryString(zzz));
		// 0 0111 | 1 0001 --> 1 0111
		zzz = xxx | yyy;
		System.out.println("result: " + Integer.toBinaryString(zzz));
		
		
		/* 6.
		 * Write a program that declares an integer variable, assigns a number, and uses
		 * a postfix increment operator to increase the value. Print the value before
		 * and after the increment operator.
		 */
		System.out.println("----------- 6. -----------");
		int a = 765;
		System.out.println(a);
		a++;
		System.out.println(a);
		
		
		/* 7.
		 * Write a program that demonstrates at least 3 ways to increment a variable by
		 * 1 and does this multiple times. Assign a value to an integer variable, print
		 * it, increment by 1, print it again, increment by 1, and then print again.
		 */
		System.out.println("----------- 7. -----------");
		int b = 2000;
		System.out.println(b);
		b = b +1;
		System.out.println(b);
		++b;
		System.out.println(b);
		b++;
		System.out.println(b);
		
		
		/* 8.
		 * Write a program that declares 2 integer variables, x, and y, and then assigns
		 * 5 to x and 8 to y. Create another variable sum and assign the value of ++x
		 * added to y and print the result. Notice the value of the sum (should be 14).
		 * Now change the increment operator to postfix (x++) and re-run the program.
		 * Notice what the value of sum is. The first configuration incremented x and
		 * then calculated the sum while the second configuration calculated the sum and
		 * then incremented x.
		 */
		System.out.println("----------- 8. -----------");
		int x1 = 5;
		int y1 = 8;
		int sum = x1++ + y1;
		System.out.println(sum);
	}
}