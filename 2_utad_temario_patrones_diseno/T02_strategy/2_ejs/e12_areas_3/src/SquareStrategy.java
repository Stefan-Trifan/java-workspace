// Estrategia concreta

public class SquareStrategy implements GeometricArea
{
    // _______________________________ Atributos
    private double valor;

    // ___________________________ Constructores
    public SquareStrategy(double valor)
    {
        this.valor = valor;
    }

    // ________________________ Métodos Públicos
    public double getArea()
    {
        return valor * valor;
    }
    // ________________________ Métodos Privados
}
