package test1;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner n= new Scanner(System.in);
        System.out.println("Enter number:");
        int number= n.nextInt();
        Scanner p= new Scanner(System.in);
        System.out.println("Enter power:");
        int power= n.nextInt();
        double result = Math.pow(number, power);
        System.out.println("Power of "+number+": "+result);
    }
}
