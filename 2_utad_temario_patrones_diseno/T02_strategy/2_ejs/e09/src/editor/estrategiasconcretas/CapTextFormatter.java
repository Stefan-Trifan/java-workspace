package editor.estrategiasconcretas;

import editor.TextFormatterStrategy;

public class CapTextFormatter implements TextFormatterStrategy
{
    // ________________________ Métodos Públicos
    @Override
    public void format(String text)
    {
        System.out.println("[CapTextFormatter]: " + text.toUpperCase());
    }
}