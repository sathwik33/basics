package test2;

import java.util.Scanner;

public class sum_of_digits_of_number {
    public static void main(String[] args) {
        int sum = 0;
        int rem;
        Scanner number = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = number.nextInt();
        while (n != 0) {

            rem = n % 10;
            sum = sum + rem;
            n=n/10;

        }
        System.out.println("Sum of digits of numbers is " + sum);
    }
}
