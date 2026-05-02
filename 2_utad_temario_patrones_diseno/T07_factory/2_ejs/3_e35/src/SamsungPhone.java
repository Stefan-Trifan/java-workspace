public class SamsungPhone implements Mobile
{
    // ------------------------------- Atributos
    private String language;
    // --------------------------- Constructores
    public SamsungPhone(String language)
    {
        this.language = language;
    }
    // ------------------------ Métodos Públicos
    @Override
    public String getBrand()
    {
        return "Samsung";
    }

    @Override
    public String getLanguage()
    {
        return language;
    }
}