public class Circle
{
    // ------------------------------- Atributos
    private double radius;
    private double area;
    // --------------------------- Constructores
    public Circle(double radius)
    {
        this.radius = radius;
        Strategy mStrategy = new CircleStrategy(radius);
        Context mContext = new Context(mStrategy);
        area = mContext.getArea();

    }
    public Circle()
    {
        this(0.0);
    }
    // --------------------------------- Getters
    public double getRadius()
    {
        return radius;
    }
    // ------------------------ Métodos Públicos
    public double getArea()
    {
        return area;
    }
    public String toString()
    {
        return "CircleStrategy [radius (" + radius + "), area (" + getArea() + ")]";
    }
}
