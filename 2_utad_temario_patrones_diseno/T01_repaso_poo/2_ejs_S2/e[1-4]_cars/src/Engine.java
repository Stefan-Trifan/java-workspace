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
    public Engine()
    {
        this("Default");
    }
    // _________________________________ Getters
    // _________________________________ Setters
    // ________________________ Métodos Públicos
    public void encender()
    {
        System.out.println(tipo + " encendido!");
    }

    @Override
    public String toString()
    {
        return "Engine" + tipo;
    }

    // ________________________ Métodos Privados
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        Engine mEngine = new Engine();
        mEngine.encender();
        System.out.println(mEngine.toString());

        System.out.println("\n_______________________END\n");
    }
}
