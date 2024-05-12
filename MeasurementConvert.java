import java.util.Scanner;

class Constant{
    double meterToMile, meterToFeet, meterToInches;

    public Constant(){
        meterToMile = 0.00062137;
        meterToFeet = 3.2808399;
        meterToInches = 39.3700787;
    }
}

public class MeasurementConvert {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Constant constant = new Constant();

        System.out.print("Measurement in meters : ");
        double meter = in.nextDouble();

        System.out.printf("%.4f Miles\n", meter * constant.meterToMile);
        System.out.printf("%.4f Feet \n", meter * constant.meterToFeet);
        System.out.printf("%.4f Inches", meter * constant.meterToInches);
    }
}
