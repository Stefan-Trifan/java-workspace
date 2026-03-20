// El contexto

public class Calculadora
{
    // _______________________________ Atributos
    private Operacion operacion;

    // ___________________________ Constructores
    public Calculadora(Operacion operacion)
    {
        this.operacion = operacion;
    }

    // _________________________________ Setters
    public void setOperacion(Operacion operacion)
    {
        this.operacion = operacion;
    }

    // ________________________ Métodos Públicos
    public int calcular(int a, int b)
    {
        return operacion.ejecutar(a, b);
    }
}

/* Ver info 
Está compuesto por un objeto de tipo Strategy
e instanciado con una estrategia concreta */
