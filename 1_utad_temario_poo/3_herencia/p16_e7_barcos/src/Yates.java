public class Yates extends Barco
{
    // ------------------------------- Atributos
    private int potenciaCV;
    private int numCamarotes;
    // ___________________ Constructor Principal
    public Yates(
        String matricula, 
        double eslora, 
        int anoFabricacion, 
        int potenciaCV,
        int numCamarotes)
    {
        super(matricula, eslora, anoFabricacion);
        this.potenciaCV = potenciaCV;
        this.numCamarotes = numCamarotes;
    }
    // ________________ Constructores Auxiliares
    // --------------------------------- Getters
    // --------------------------------- Setters
    // ------------------------ Métodos Públicos
    @Override
    public double calcularModulo()
    {
        return super.calcularModulo() + potenciaCV + numCamarotes;
    }
    // ------------------------ Métodos Privados 
}
