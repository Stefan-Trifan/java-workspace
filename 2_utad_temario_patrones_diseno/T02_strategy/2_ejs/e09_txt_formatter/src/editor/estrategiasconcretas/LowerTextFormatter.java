package editor.estrategiasconcretas;

import editor.TextFormatterStrategy;

public class LowerTextFormatter implements TextFormatterStrategy
{
    // ________________________ Métodos Públicos
    @Override
    public void format(String text)
    {
        System.out.println("[LowerTextFormatter]: " + text.toLowerCase());
    }
}