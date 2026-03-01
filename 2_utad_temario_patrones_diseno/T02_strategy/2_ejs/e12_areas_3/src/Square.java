// Cliente

public class Square implements GeometricArea
{
    // _______________________________ Atributos
    private double side;
    private double area;

    // ___________________________ Constructores
    public Square(double side)
    {
        this.side = side;
        GeometricArea miInterfaz = new SquareStrategy(side);
        ContextAreaStrategy miContext = new ContextAreaStrategy(miInterfaz);
        area = miContext.getArea();
    }

    public Square()
    {
        this(0.0);
    }

    // _________________________________ Getters
    public double getSide()
    {
        return side;
    }

    // ________________________ Métodos Públicos
    public double getArea()
    {
        return area;
    }

    public String toString()
    {
        return "SquareStrategy ["
            + "\n   side (" + side + "), "
            + "\n   area (" + getArea() + ")\n]";
    }
}
