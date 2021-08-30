package test1;

import java.util.Scanner;

public class perimeter {
    public static void main(String[] args) {
        Scanner a= new Scanner(System.in);
        System.out.println("Enter area:");
        double area= a.nextDouble();
        double perimeter= 4*area;
        System.out.println("Perimeter of a square with area "+area+ " is: "+perimeter);
    }
}
