public class SodaCan {
    private final double height;
    private final double diameter;

    public SodaCan(double height, double diameter){
        this.height = height;
        this.diameter = diameter;
    }

    public double getVolume(){
        return Math.PI * diameter * diameter / 4 * height;
    }

    public double getSurfaceArea(){
        return 2 * Math.PI * diameter / 2 * height;
    }
}
