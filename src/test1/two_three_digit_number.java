package test1;

import java.util.Scanner;

public class two_three_digit_number {
    public static void main(String[] args) {
        int count=0;
        Scanner number=new Scanner(System.in);
        System.out.println("Enter number:");
        int n= number.nextInt();
        while(n!=0){

            n=n/10;
            count=count+1;

        }
        System.out.println("Given number is "+count+" digit number");
    }
}
