import java.util.Scanner;

class Calculation {
    public int sum(int firstVal, int secondVal){
        return firstVal + secondVal;
    }
    public int difference(int firstVal, int secondVal){
        return firstVal - secondVal;
    }
    public int product(int firstVal, int secondVal){
        return firstVal * secondVal;
    }
    public double average(int firstVal, int secondVal) {
        return (firstVal + secondVal) / 2.0;
    }
    public int distance(int firstVal, int secondVal){
        return Math.abs(difference(firstVal, secondVal));
    }
    public int max(int firstVal, int secondVal){
        return Math.max(firstVal, secondVal);
    }
    public int min(int firstVal, int secondVal){
        return Math.min(firstVal, secondVal);
    }
}

public class TwoInteger {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Calculation math = new Calculation();

        int firstVal = in.nextInt();
        int secondVal = in.nextInt();

        System.out.printf("Sum         : %4d\n", math.sum(firstVal, secondVal));
        System.out.printf("Difference  : %4d\n", math.difference(firstVal, secondVal));
        System.out.printf("Product     : %4d\n", math.product(firstVal, secondVal));
        System.out.printf("Average     : %7.2f\n", math.average(firstVal, secondVal));
        System.out.printf("Distance    : %4d\n", math.distance(firstVal, secondVal));
        System.out.printf("Maximum     : %4d\n", math.max(firstVal, secondVal));
        System.out.printf("Minimum     : %4d\n", math.min(firstVal, secondVal));
    }
}

