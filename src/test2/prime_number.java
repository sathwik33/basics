package test2;

import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {
        int count=0;
        Scanner n= new Scanner(System.in);
        System.out.println("Enter number:");
        int number=n.nextInt();
        for(int i=2;i<=number;i++){
            if(number%2==0)
            {
                break;
            }
            else if(number%i==0)
                count++;
        }
        if(count==1)
            System.out.println(" "+number+" is a prime number");
        else
            System.out.println("Not a prime number");
    }
}
