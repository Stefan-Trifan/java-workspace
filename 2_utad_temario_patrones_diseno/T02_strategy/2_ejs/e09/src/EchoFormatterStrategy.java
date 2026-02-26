public class EchoFormatterStrategy implements TextFormatterStrategy
{
    // ________________________ Métodos Públicos
    @Override
    public void format(String text)
    {
        System.out.println("[EchoFormatterStrategy]: " + text);
    }
}
