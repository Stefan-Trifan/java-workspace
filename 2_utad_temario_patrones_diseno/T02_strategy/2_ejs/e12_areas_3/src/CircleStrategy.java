// Estrategia concreta

public class CircleStrategy implements GeometricArea
{
    // _______________________________ Atributos
    private double valor;

    // ___________________________ Constructores
    public CircleStrategy(double valor)
    {
        this.valor = valor;
    }

    // ________________________ Métodos Públicos
    public double getArea()
    {
        return Math.PI * Math.pow(valor, 2);
    }
    // ________________________ Métodos Privados
}
