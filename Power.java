import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();

        int square = number * number;
        int cube = number * number * number;
        int fourthPower = (int) Math.pow(number, 4);

        System.out.printf("Square       :%9d\n", square);
        System.out.printf("Cube         :%9d\n", cube);
        System.out.printf("Fourth power :%9d", fourthPower);
    }
}
