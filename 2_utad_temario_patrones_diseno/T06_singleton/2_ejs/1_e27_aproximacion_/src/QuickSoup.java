public class QuickSoup
{
    // ------------------------------- Atributos
    private static QuickSoup instance = new QuickSoup();
    // --------------------------- Constructores
    private QuickSoup()
    {
    };
    // --------------------------------- Getters
    // --------------------------------- Setters
    // ------------------------ Métodos Públicos
    public static QuickSoup getInstance()
    {
        return instance;
    }
    public void ready()
    {
        System.out.println("QuickSoup is ready");
    }
    // ------------------------ Métodos Privados

}