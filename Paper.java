public class Paper {
    private double width, height;
    private final double constant = 25.4;

    public Paper(){
        width = 8.5;
        height = 11;
    }
    public static void main(String[] args) {
        Paper paper = new Paper();

        System.out.printf("The height %.2f milimeter\n", paper.height * paper.constant);
        System.out.printf("The width %.2f milimeter\n", paper.width * paper.constant);
        System.out.printf("The perimeter %.2f milimeter\n", 2 * (paper.height + paper.width) * paper.constant);
        System.out.printf("The length of diagonal %.2f milimeter\n",  Math.sqrt(Math.pow(paper.height, 2) + Math.pow(paper.width, 2)));
    }
}
