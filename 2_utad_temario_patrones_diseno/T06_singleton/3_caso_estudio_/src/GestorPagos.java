public class GestorPagos
{
    // ------------------------------- Atributos
    private static GestorPagos instance = new GestorPagos();
    private PagarStrategy      pagarStrategy;
    // --------------------------- Constructores
    private GestorPagos()
    {
    };
    // --------------------------------- Getters
    // --------------------------------- Setters
    public void setMetodoPago(PagarStrategy pagarStrategy)
    {
        this.pagarStrategy = pagarStrategy;
    }
    // ------------------------ Métodos Públicos
    public static GestorPagos getInstance()
    {
        return instance;
    }
    public void pay()
    {
        if (pagarStrategy != null)
        {
            pagarStrategy.pagar();
        }
        else
        {
            System.out.println("Introduce metodo de pago, por favor antes");
        }
    }
    // ------------------------ Métodos Privados
}
