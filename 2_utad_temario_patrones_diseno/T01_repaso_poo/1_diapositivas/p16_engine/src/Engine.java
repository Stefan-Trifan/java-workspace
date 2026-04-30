public class Engine
{
    // ------------------------------- Atributos
    private String tipo;
    // ___________________ Constructor Principal
    public Engine(String tipo)
    {
        this.tipo = tipo;
    }
    // ________________ Constructores Auxiliares
    // --------------------------------- Getters
    // --------------------------------- Setters
    // ------------------------ Métodos Públicos
    public String encender()
    {
        return this.tipo + " encendido";
    }
    // ------------------------ Métodos Privados 

}
