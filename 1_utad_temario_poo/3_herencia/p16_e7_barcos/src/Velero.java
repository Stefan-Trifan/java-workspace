public class Velero extends Barco
{
    // _______________________________ Atributos
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
    // _________________________________ Getters
    // _________________________________ Setters
    // ________________________ Métodos Públicos
    @Override
    public double calcularModulo()
    {
        return super.calcularModulo() + numeroMastiles;
    }
    // ________________________ Métodos Privados 
}
