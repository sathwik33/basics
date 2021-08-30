package test1;

public class ly_test {
    public static void main(String[] args) {
        int year=2012;
        if(year%400==0){
            System.out.println("leap year");
    }

    else if( year%100==0){
            System.out.println("Not a leap year");
        }
        else if(year%4==0){
            System.out.println("A leap year");
        }
    else {
        System.out.println("Not a leap year");
        }
    }
}
