public class CircleStrategy implements Strategy
{
    // _______________________________ Atributos
    private double valor;
    // ___________________________ Constructores
    public CircleStrategy(double valor)
    {
        this.valor = valor;
    }
    // _________________________________ Getters
    // _________________________________ Setters
    // ________________________ Métodos Públicos
    public double getArea()
    {
        return Math.PI * Math.pow(valor, 2);
    }
    // ________________________ Métodos Privados
}
