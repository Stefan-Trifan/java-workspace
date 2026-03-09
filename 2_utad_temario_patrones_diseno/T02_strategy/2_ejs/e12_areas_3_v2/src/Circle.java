public class Circle
{
    // _______________________________ Atributos
    private double radius;
    private double area;
    // ___________________________ Constructores
    public Circle(double radius)
    {
        this.radius = radius;
        Strategy mStrategy = new CircleStrategy(radius);
        ContextAreaStrategy mContext = new ContextAreaStrategy(mStrategy);
        area = mContext.getArea();

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
        return "CircleStrategy [radius (" + radius + "), area (" + getArea() + ")]";
    }
}
