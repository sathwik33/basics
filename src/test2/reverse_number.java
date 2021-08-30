package test2;

import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args) {
        int sum=0;
        int rem;
        Scanner number=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=number.nextInt();
        while(n!=0){
            rem=n%10;
            sum=(sum*10)+rem;
            n=n/10;
        }
        System.out.println("Reversed number is: "+sum);
    }
}
