package com.perscholas.java_basics.exercises;

public class Loops {

    public static void main(String[] args) {
        /* 1.
         * Write a program that uses a for-loop to loop through the numbers 1-10 and
         * prints out each number.
         */
        System.out.println("----------- 1. -----------");
        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
        }


        /* 2.
         * Write a program that uses a while loop to loop through the numbers 0-100 in
         * increments of 10 and prints out each number.
         */
        System.out.println("----------- 2. -----------");
        int ii = 0;
        while(ii <= 100) {
            System.out.println(ii);
            ii+=10;
        }


        /* 3.
         * Write a program that uses a do-while-loop to loop through the numbers 1-10
         * and prints out each number.
         */
        System.out.println("----------- 3. -----------");
        int jj = 1;
        do {
            System.out.println(jj);
            jj++;
        }while(jj <= 10);


        /* 4.
         * Write a program that uses a for-loop to loop through the numbers 1-100. Print
         * out each number if is a multiple of 5, but do not print out any numbers
         * between 25 and 75. Use the �continue� statement to accomplish this.
         */
        System.out.println("----------- 4. -----------");
        for(int k = 1; k < 100; k++) {
            if(k%5 == 0) {
                if(k>=25 && k<=75) {
                    continue;
                }else {
                    System.out.println(k);
                }
            }
        }


        /* 5.
         * Write a program that uses a for-loop to loop through the numbers 1-100. Print
         * out each number if is a multiple of 5, but do not print out any numbers
         * greater than 50. Use the �break� keyword to accomplish this.
         */
        System.out.println("----------- 5. -----------");
        for(int k = 1; k <= 100; k++) {
            if(k%5 == 0) {
                if(k > 50) {
                    break;
                }else {
                    System.out.println(k);
                }
            }
        }


        /* 6.
         * Write a program that uses nested for-loops to output the following:
         * Week 1:
         * Day 1
         * Day 2
         * Day 3
         * Day 4
         * Day 5
         * Week 2:
         * Day 1
         * Day 2
         * Day 3
         * Day 4
         * Day 5
         */
        System.out.println("----------- 6. -----------");
        for(int k = 1; k <= 2; k++) {
            System.out.println("Week " + k + ":");
            for(int q = 1; q <= 5; q++) {
                System.out.println("Day " + q);
            }
        }


        /* 7.
         * Write a program that returns all the available palindromes within 10 and 200.
         * The following output will be produced:
         * 11, 22, 33, 44, 55, 66, 77, 88, 99, 101, 111, 121, 131, 141, 151, 161, 171, 181, 191,
         */
        System.out.println("----------- 7. -----------");
        for(int q = 10; q < 200; q++) {
            String str = Integer.toString(q);
            if(str.equals(new StringBuilder(str).reverse().toString())) {
                System.out.print(str + ", ");
            }
        }


        /* 8.
         * Write a program that prints the Fibonacci Sequence from 0 to 50. The
         * following output will be produced: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,
         */
        System.out.println("\n----------- 8. -----------");
        final int MAX = 50;
        int n1 = 0;
        int n2 = 1;
        while(n1 < 50) {
            System.out.println(n1);
            int next = n1 + n2;
            n1 = n2;
            n2 = next;
        }


        /* 9.
         * Write a program that nests a for-loop inside another. Print out the inner and
         * outer variable (e.g., i or j) in the inner loop (e.g.,
         * System.out.println("Inner loop: i: " + i + ", j: " + j);).
         */
        System.out.println("----------- 9. -----------");
        for(int i = 0; i <= 3; i++) {
            for(int j = 0; j <= 10; j++) {
                System.out.println("Inner loop: i: " + i + ", j: " + j);
            }
        }
    }
}