public class IceCreamCone {
    private double  height, radius;

    public IceCreamCone(double  height, double radius){
        this.height = height;
        this.radius = radius;
    }
    public double getSurfaceArea(){
        return Math.PI * radius * Math.sqrt(radius * radius + height * height);
    }

    public double getVolume(){
        return Math.PI * radius * radius *height / 3;
    }
}
