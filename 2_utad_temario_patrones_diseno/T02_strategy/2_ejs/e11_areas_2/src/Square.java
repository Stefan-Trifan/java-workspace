public class Square
{
    // _______________________________ Atributos
    private double side;
    private double area;
    // ___________________________ Constructores
    public Square(double side)
    {
        this.side = side;
        Strategy mStrategy = new SquareStrategy(side);
        Context mContext = new Context(mStrategy);
        area = mContext.getArea();
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
        return "SquareStrategy [side (" + side + "), area (" + getArea() + ")]";
    }
}
