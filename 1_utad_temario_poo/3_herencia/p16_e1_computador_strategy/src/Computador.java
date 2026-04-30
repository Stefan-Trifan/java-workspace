// Contexto

public class Computador
{
    // _________________________________________
    // ------------------------------- Atributos

    private double        peso;
    private EstrategiaFormatoPeso miEstrategia;

    // _________________________________________
    // ___________________ Constructor Principal

    public Computador(double peso)
    {
        this.peso = peso;
    }

    // _________________________________________
    // ________________ Constructores Auxiliares

    public Computador()
    {
        this(0);
    }

    // _________________________________________
    // --------------------------------- Getters

    public double getpeso()
    {
        return peso;
    }

    // _________________________________________
    // --------------------------------- Setters

    public void setpeso(double peso)
    {
        this.peso = peso;
    }

    // _________________________________________
    // ------------------------ Métodos Públicos

    public void setEstrategia(EstrategiaFormatoPeso estrategia)
    {
        this.miEstrategia = estrategia;
    }

    public String mostrarPeso()
    {
        return miEstrategia.devolverPeso(peso);
    }

    // _________________________________________
    // ------------------------ Métodos Privados
}