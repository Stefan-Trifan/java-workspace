package e02;

public class Circle extends Shape
{
    // Atributos
    public double radio;
    private double pi = 3.14;

    // Constructores
    public Circle(double radio)
    {
        this.radio = radio;
    }

    // Métodos públicos
    @Override
    public double calculateArea()
    {
        return area = pi * radio * radio;
    }
}
