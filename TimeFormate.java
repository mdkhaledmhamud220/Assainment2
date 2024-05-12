import java.util.Scanner;

public class TimeFormate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the first time:");
        int firstTime = in.nextInt();

        System.out.print("\nPlease enter the second time:");
        int secondTime = in.nextInt();

        firstTime = (firstTime / 100) * 60 + firstTime % 100;
        secondTime = (secondTime / 100) * 60 + secondTime % 100;

        int actualTime = secondTime - firstTime;

        if(actualTime < 0) actualTime = (24 * 60) + actualTime;

        int hours  = actualTime / 60;

        int minuites = actualTime - hours * 60;

        System.out.println("\n" + hours + " hours " + minuites + " minuites");
    }
}
