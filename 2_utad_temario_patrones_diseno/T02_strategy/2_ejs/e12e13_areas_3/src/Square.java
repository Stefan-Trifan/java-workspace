public class Square
{
    // ------------------------------- Atributos
    private double side;
    private double area;
    // --------------------------- Constructores
    public Square(double side)
    {
        this.side = side;
        Strategy mStrategy = new SquareStrategy(side);
        ContextAreaStrategy mContext = new ContextAreaStrategy(mStrategy);
        area = mContext.getArea();
    }
    public Square()
    {
        this(0.0);
    }
    // --------------------------------- Getters
    public double getSide()
    {
        return side;
    }
    // ------------------------ Métodos Públicos
    public double getArea()
    {
        return area;
    }
    public String toString()
    {
        return "SquareStrategy [side (" + side + "), area (" + getArea() + ")]";
    }
}
