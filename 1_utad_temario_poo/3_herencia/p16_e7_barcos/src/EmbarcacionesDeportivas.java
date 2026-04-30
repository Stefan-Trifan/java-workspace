public class EmbarcacionesDeportivas extends Barco
{
    // ------------------------------- Atributos
    private int potenciaCV;
    // ___________________ Constructor Principal
    public EmbarcacionesDeportivas(
        String matricula, 
        double eslora, 
        int anoFabricacion, 
        int potenciaCV)
    {
        super(matricula, eslora, anoFabricacion);
        this.potenciaCV = potenciaCV;
    }
    // ________________ Constructores Auxiliares
    // --------------------------------- Getters
    // --------------------------------- Setters
    // ------------------------ Métodos Públicos
    @Override
    public double calcularModulo()
    {
        return super.calcularModulo() + potenciaCV;
    }
    // ------------------------ Métodos Privados 
}
