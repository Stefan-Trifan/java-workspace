public class Iphone implements Mobile
{
    // ------------------------------- Atributos
    private String language;
    // --------------------------- Constructores
    public Iphone(String language)
    {
        this.language = language;
    }
    // ------------------------ Métodos Públicos
    @Override
    public String getBrand()
    {
        return "Apple";
    }

    @Override
    public String getLanguage()
    {
        return language;
    }
}