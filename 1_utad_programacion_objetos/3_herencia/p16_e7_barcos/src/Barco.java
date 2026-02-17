public class Barco
{
    // _______________________________ Atributos
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
    // _________________________________ Getters
    // _________________________________ Setters
    // ________________________ Métodos Públicos
    public double calcularModulo()
    {
        return eslora * 10;
    }
    // ________________________ Métodos Privados
}
