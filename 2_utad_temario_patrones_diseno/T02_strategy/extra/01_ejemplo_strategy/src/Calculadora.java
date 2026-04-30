// El contexto

public class Calculadora
{
    // ------------------------------- Atributos
    private Operacion operacion;

    // --------------------------- Constructores
    public Calculadora(Operacion operacion)
    {
        this.operacion = operacion;
    }

    // --------------------------------- Setters
    public void setOperacion(Operacion operacion)
    {
        this.operacion = operacion;
    }

    // ------------------------ Métodos Públicos
    public int calcular(int a, int b)
    {
        return operacion.ejecutar(a, b);
    }
}

/* Ver info 
Está compuesto por un objeto de tipo Strategy
e instanciado con una estrategia concreta */
