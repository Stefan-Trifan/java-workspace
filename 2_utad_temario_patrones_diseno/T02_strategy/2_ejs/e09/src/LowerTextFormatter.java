public class LowerTextFormatter implements TextFormatterStrategy
{
    @Override
    public void format(String text)
    {
        System.out.println("[LowerTextFormatter]: " + text.toLowerCase());
    }
}