import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Lengths of a rectangle’s sides : ");
        int side = in.nextInt();

        System.out.println("The area of the rectangle      : " + side * side);
        System.out.println("The perimeter of the rectangle : " + 4 * side);
        System.out.printf("The length of the diagonal     : %.2f\n", Math.sqrt(2 * side * side));
    }
}
