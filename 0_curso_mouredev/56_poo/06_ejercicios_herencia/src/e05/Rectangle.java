package e05;

public class Rectangle extends ShapeWithArea
{
    // Atributos
    public double base;
    public double altura;

    // Constructores

    // Getters

    // Setters

    // Métodos públicos
    @Override
    public void calculateArea()
    {
        area = base * altura;
    }

    // Métodos privados
}
