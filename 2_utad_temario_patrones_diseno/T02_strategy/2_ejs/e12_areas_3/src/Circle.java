// Cliente

public class Circle implements GeometricArea
{
    // _______________________________ Atributos
    private double radius;
    private double area;

    // ___________________________ Constructores
    public Circle(double radius)
    {
        this.radius = radius;
        GeometricArea miInterfaz = new CircleStrategy(radius);
        ContextAreaStrategy miContext = new ContextAreaStrategy(miInterfaz);
        area = miContext.getArea();

    }

    public Circle()
    {
        this(0.0);
    }

    // _________________________________ Getters
    public double getRadius()
    {
        return radius;
    }

    // ________________________ Métodos Públicos
    public double getArea()
    {
        return area;
    }

    public String toString()
    {
        return "CircleStrategy ["
            + "\n   radius (" + radius + "), "
            + "\n   area   (" + String.format(java.util.Locale.US, "%.3f", getArea())
            + ")\n]";
    }
}
