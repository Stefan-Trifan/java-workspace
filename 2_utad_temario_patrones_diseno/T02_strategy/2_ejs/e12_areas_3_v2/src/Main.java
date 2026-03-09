public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        Square miSquare = new Square(3.0);
        Circle miCircle = new Circle(3.0);

        System.out.println(miSquare.toString());
        System.out.println(miCircle.toString());

        System.out.println("\n_______________________END\n");
    }
}