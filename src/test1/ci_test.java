package test1;

public class ci_test {
    public static void main(String[] args) {
        double compundinterest;
        double amount;
        double principal=10000;
        double rateofinterest=5;
        double time=2;
        amount= principal*(Math.pow(1+rateofinterest/100, time));
        compundinterest= amount-principal;
        System.out.println(" compound interest is : "+ compundinterest);

    }
}
