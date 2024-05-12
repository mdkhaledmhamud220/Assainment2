import java.util.Scanner;

public class IndividualDigit {
    public static void rec(int numder){
        if(numder == 0) return;

        rec(numder / 10);

        System.out.printf("%d ",numder % 10);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();

        rec(number);
    }
}
