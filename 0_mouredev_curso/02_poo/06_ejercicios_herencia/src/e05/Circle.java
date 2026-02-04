package e05;

public class Circle extends ShapeWithArea
{
    // Atributos
    public double radio;
    private double pi = 3.14;

    // Constructores

    // Getters

    // Setters

    // Métodos públicos
    @Override
    public void calculateArea()
    {
        area = pi * radio * radio;
    }

    // Métodos privados
}
