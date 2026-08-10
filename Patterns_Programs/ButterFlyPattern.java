//🦋 Butterfly Pattern Using Numbers in Java

import java.util.*;
class ButterflyPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();

        for(int i = 1; i <= 2*n-1; i++) {

            int rows = i <= n ? i : 2*n-i;

            // Left side
            for(int j = 1; j <= rows; j++) {
                System.out.print(j + " ");
            }

            // Middle space
            for(int j = 1; j <= 2*(n-rows); j++) {
                System.out.print("  ");
            }

            // Right side
            for(int j = rows; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}

/*
🦋 Butterfly Pattern in Java:
This Java program prints a Butterfly Number Pattern using nested loops.
Features:
Accepts the number of rows as user input.
Prints a butterfly pattern using numbers.
Uses a single outer for loop for both upper and lower halves.
Uses the ternary operator to calculate the current row.
Uses nested for loops to print numbers and spaces.
Demonstrates basic pattern programming concepts in Java.


Example Output:
Enter the number of rows: 
5

1                 1
1 2             2 1
1 2 3         3 2 1
1 2 3 4     4 3 2 1
1 2 3 4 5 5 4 3 2 1
1 2 3 4     4 3 2 1
1 2 3         3 2 1
1 2             2 1
1                 1


Concepts Used:
Java Scanner Class
User Input Handling
Nested for Loops
Ternary Operator
Number Pattern Printing
Loop Control
Butterfly Pattern Logic
*/
