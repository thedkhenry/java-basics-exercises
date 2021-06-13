package com.perscholas.java_basics.exercises;

public class JavaBasicsClass {

	public static void main(String[] args) {
		/* 1.
		 * Write a program that declares 2 integer variables, assigns an integer to each, and adds them together. 
		 * Assign the sum to a variable. Print out the result.
		 */
		System.out.println("----------- 1. -----------");
		int a = 5;
		int b = 7;
		int intSum = a + b;
		System.out.println(intSum);
		
		/* 2.
		 * Write a program that declares 2 double variables, assigns a number to each, and adds them together. 
		 * Assign the sum to a variable. Print out the result.
		 */
		System.out.println("----------- 2. -----------");
		double n = 123.12;
		double m = 456.45;
		double doubleSum = n + m;
		System.out.println(doubleSum);
		
		/* 3.
		 * Write a program that declares an integer variable and a double variable, assigns numbers to each, and adds them together. 
		 * Assign the sum to a variable. Print out the result. What variable type must the sum be?
		 */
		System.out.println("----------- 3. -----------");
		int i = 30;
		double d = 50.123;
		double sum = i + d;
		System.out.println(sum);
		// Sum has to be a double data type.
		
		/* 4.
		 * Write a program that declares 2 integer variables, assigns an integer to each, and 
		 * divides the larger number by the smaller number. Assign the result to a variable. Print out the result. 
		 * Now change the larger number to a decimal. What happens? What corrections are needed?
		 */
		System.out.println("----------- 4. -----------");
		int j = 20;
		double k = 45;
		double result1 = k/j;
		System.out.println(result1);
		// Shows error after changing to decimal. Can't convert double to int. Need to cast expression to int OR change result1 to float/double
		
		/* 5.
		 * Write a program that declares 2 double variables, assigns a number to each, and divides the larger by 
		 * the smaller. Assign the result to a variable. Print out the result. Now, cast the result to an integer. 
		 * Print out the result again.
		 */
		System.out.println("----------- 5. -----------");
		double aa = 123.45;
		double bb = 768.99;
		double result2 = bb/aa;
		System.out.println(result2);
		System.out.println((int)(result2));
		
		/* 6.
		 * Write a program that declares 2 integer variables, x, and y, and assign 5 to x and 6 to y. 
		 * Declare a variable q and assign y/x to it and print q. Now, cast y to a double and assign to q. Print q again.
		 */
		System.out.println("----------- 6. -----------");
		int x = 5;
		int y = 6;
		double q = y/x;
		System.out.println(q);
		q = (double) y;
		System.out.println(q);
		
		/* 7.
		 * Write a program that declares a named constant and uses it in a calculation. Print the result.
		 */
		System.out.println("----------- 7. -----------");
		final int MULTIPLIER = 2;
		int result3 = MULTIPLIER * 6;
		System.out.println(result3);
		
		/* 8.
		 * Write a program where you create 3 variables that represent products at a cafe. The products could be 
		 * beverages like coffee, cappuccino, espresso, green tea, etc. Assign prices to each product. 
		 * Create 2 more variables called subtotal and totalSale and complete an “order” for 3 items of the 
		 * first product, 4 items of the second product, and 2 items of the third product. Add them all together to 
		 * calculate the subtotal. Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the 
		 * totalSale amount. Be sure to format the results to 2 decimal places.
		 */
		System.out.println("----------- 8. -----------");
		double coffee = 4.44;
		double cappuccino = 5.55;
		double espresso = 6.66;
		double subtotal , totalSale;
		subtotal = (coffee*3) + (cappuccino*4) + (espresso*2);
		final double SALES_TAX = 7.77;
		totalSale = subtotal + SALES_TAX;
		System.out.printf("%.2f",totalSale);
	}
}

















