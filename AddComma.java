import java.util.Scanner;

public class AddComma {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter an integer between 1000 and 999999: ");

        int number = in.nextInt();

        System.out.println(number / 1000 + "," + number % 1000);
    }
}
