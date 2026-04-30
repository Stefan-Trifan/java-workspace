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
    public Engine()
    {
        this("Default");
    }
    // --------------------------------- Getters
    // --------------------------------- Setters
    // ------------------------ Métodos Públicos
    public void encender()
    {
        System.out.println(tipo + " encendido!");
    }

    @Override
    public String toString()
    {
        return "Engine" + tipo;
    }

    // ------------------------ Métodos Privados
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        Engine mEngine = new Engine();
        mEngine.encender();
        System.out.println(mEngine.toString());

        System.out.println("\n_______________________END\n");
    }
}
