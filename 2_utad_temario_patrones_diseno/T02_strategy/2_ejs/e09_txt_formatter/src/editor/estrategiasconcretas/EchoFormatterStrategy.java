package editor.estrategiasconcretas;

import editor.TextFormatterStrategy;

public class EchoFormatterStrategy implements TextFormatterStrategy
{
    // ------------------------ Métodos Públicos
    @Override
    public void format(String text)
    {
        System.out.println("[EchoFormatterStrategy]: " + text);
    }
}
