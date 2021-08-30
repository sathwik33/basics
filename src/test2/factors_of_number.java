package test2;

import java.util.Scanner;

public class factors_of_number {
    public static void main(String[] args) {
        Scanner n= new Scanner(System.in);
        System.out.println("Enter number:");
        int number=n.nextInt();
        for(int i=1; i<=number;i++){
            if(number%i==0)
                System.out.println(" "+i);
        }
        for(int i=-1;i>=number;i--){
            if(number%i==0)
                System.out.println(" "+i);

        }
    }
}
