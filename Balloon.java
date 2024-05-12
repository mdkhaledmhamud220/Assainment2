public class Balloon {
    private double balloonVolume;

    public Balloon(){
        balloonVolume = 0;
    }

    public void addAir(double amount) {
        balloonVolume = amount;
    }

    public double getVolume() {
        return balloonVolume;
    }

    public double getSurfaceArea() {
        return 4 * Math.PI * getRadius() * getRadius();
    }

    public double getRadius() {
        return Math.pow(((3.0 * balloonVolume) / (4 * Math.PI)), 1.0 / 3);
    }
}
