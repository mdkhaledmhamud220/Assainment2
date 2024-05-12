import java.util.Scanner;

public class Sphere {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Radius");
        int radius = in.nextInt();

        System.out.printf("The area of a circle : %.2f\n", Math.PI * radius * radius);
        System.out.printf("The circumference of a circle : %.2f\n", 2 * Math.PI * radius);

        System.out.printf("The volume of a sphere : %.2f\n", (4 * Math.PI * Math.pow(radius, 3)) / 3);
        System.out.printf("The surface area of a sphere : %.2f\n", 4 * Math.PI * radius * radius);
    }
}
