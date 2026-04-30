public class Polideportivo implements InstalacionDeportiva, Edificio
{
    // ------------------------------- Atributos
    double superficie;
    String tipo;
    // ___________________ Constructor Principal
    public Polideportivo(double superficie, String tipo)
    {
        this.superficie = superficie;
        this.tipo = tipo;
    }
    // ________________ Constructores Auxiliares
    // --------------------------------- Getters
    // --------------------------------- Setters
    // ------------------------ Métodos Públicos
    public double getSuperficieEdificio()
    {
        return this.superficie;
    }
    public int getTipoDeInstalacion()
    {
        return 0;
    }
}
