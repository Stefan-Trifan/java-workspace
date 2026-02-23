public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        Rectangle miRectangle = new Rectangle("A4", 2, 3);

        miRectangle.drawTxt();
        System.out.println(miRectangle.printDescription());

        GeometricFigure miSquare = new Square("A5", 2);
        miSquare.drawTxt();
        System.out.println(miSquare.printDescription());

        System.out.println("\n_______________________END\n");
    }
}