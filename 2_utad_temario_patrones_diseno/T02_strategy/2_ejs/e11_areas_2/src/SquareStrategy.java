public class SquareStrategy implements Strategy
{
    // _______________________________ Atributos
    private double valor;
    // ___________________________ Constructores
    public SquareStrategy(double valor)
    {
        this.valor = valor;
    }
    // _________________________________ Getters
    // _________________________________ Setters
    // ________________________ Métodos Públicos
    public double getArea()
    {
        return valor * valor;
    }
    // ________________________ Métodos Privados
}
