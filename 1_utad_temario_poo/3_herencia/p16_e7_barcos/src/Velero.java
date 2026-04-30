public class Velero extends Barco
{
    // ------------------------------- Atributos
    private int numeroMastiles;
    // ___________________ Constructor Principal
    public Velero(
        String matricula, 
        double eslora, 
        int anoFabricacion,
        int numeroMastiles)
    {
        super(matricula, eslora, anoFabricacion);
        this.numeroMastiles = numeroMastiles;
    }
    // ________________ Constructores Auxiliares
    // --------------------------------- Getters
    // --------------------------------- Setters
    // ------------------------ Métodos Públicos
    @Override
    public double calcularModulo()
    {
        return super.calcularModulo() + numeroMastiles;
    }
    // ------------------------ Métodos Privados 
}
