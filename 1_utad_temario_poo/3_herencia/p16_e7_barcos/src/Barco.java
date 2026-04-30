public class Barco
{
    // ------------------------------- Atributos
    private String matricula;
    private double eslora;
    private int    anoFabricacion;
    // ___________________ Constructor Principal
    public Barco(String matricula, double eslora, int anoFabricacion)
    {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anoFabricacion = anoFabricacion;
    }
    // ________________ Constructores Auxiliares
    // --------------------------------- Getters
    // --------------------------------- Setters
    // ------------------------ Métodos Públicos
    public double calcularModulo()
    {
        return eslora * 10;
    }
    // ------------------------ Métodos Privados
}
