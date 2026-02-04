package e02;

public class Rectangle extends Shape
{
    // Atributos
    public double base;
    public double altura;

    // Constructores
    public Rectangle(double base, double altura)
    {
        this.base = base;
        this.altura = altura;
    }

    // Métodos públicos
    @Override
    public double calculateArea()
    {
        return area = base * altura;
    }
}
