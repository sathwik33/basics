package test2;

import java.util.Scanner;

public class find_no_of_digits {
    public static void main(String[] args) {
        int count=0;
        Scanner n= new Scanner(System.in);
        System.out.println("Enter number:");
        int number=n.nextInt();
        while(number!=0){
            number=number/10;
            count=count+1;
        }
        System.out.println("No.of digits in the given integer are: "+count);
    }
}
