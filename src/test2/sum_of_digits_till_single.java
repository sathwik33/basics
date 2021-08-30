package test2;

import java.util.Scanner;

public class sum_of_digits_till_single {
    public static void main(String[] args) {
        int sum = 0;
        int final_sum=0;
        int rem;
        Scanner number = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = number.nextInt();
        while (n != 0) {

            rem = n % 10;
            sum = sum + rem;
            n=n/10;

        }
        if(sum/10!=0){
            while (sum != 0) {

                rem = sum % 10;
                final_sum = final_sum + rem;
                sum=sum/10;

            }

        }
        System.out.println("Sum of digits of numbers is " + final_sum);
    }
}
