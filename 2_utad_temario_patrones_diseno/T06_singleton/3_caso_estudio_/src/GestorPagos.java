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
    public void setPagarStrategy(PagarStrategy pagarStrategy)
    {
        this.pagarStrategy = pagarStrategy;
    }
    // --------------------------------- Setters
    // ------------------------ Métodos Públicos
    public static GestorPagos getInstance()
    {
        return instance;
    }
    public void pay()
    {
        pagarStrategy.pagar();
    }
    // ------------------------ Métodos Privados
}
