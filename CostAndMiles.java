import java.util.Scanner;

public class CostAndMiles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("The number of gallons of gas in the tank");
        double gallon = in.nextDouble();

        System.out.println("The fuel efficiency in miles per gallon");
        double efficiency = in.nextDouble();

        System.out.println("The price of gas per gallon");
        double price = in.nextDouble();

        double cost = 100 / efficiency * price;
        double canGo = efficiency * gallon;

        System.out.println("Cost per 100 miles : " + cost);
        System.out.println("Car can go " + canGo + " miles");
    }
}