public class Engine
{
    // _______________________________ Atributos
    private String tipo;
    // ___________________ Constructor Principal
    public Engine(String tipo)
    {
        this.tipo = tipo;
    }
    // ________________ Constructores Auxiliares
    // _________________________________ Getters
    // _________________________________ Setters
    // ________________________ Métodos Públicos
    public String encender()
    {
        return this.tipo + " encendido";
    }
    // ________________________ Métodos Privados 

}
