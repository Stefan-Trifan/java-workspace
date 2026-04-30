package editor;
// Contexto

import editor.estrategiasconcretas.EchoFormatterStrategy;

public class TextEditorContext
{
    // ------------------------------- Atributos
    private TextFormatterStrategy textFormatterStrategy;

    // ___________________ Constructor Principal
    public TextEditorContext(TextFormatterStrategy textFormatterStrategy)
    {
        this.textFormatterStrategy = textFormatterStrategy;
    }
    public TextEditorContext()
    {
        this(new EchoFormatterStrategy());
    }

    // --------------------------------- Getters
    public TextFormatterStrategy getTextFormatterStrategy()
    {
        return this.textFormatterStrategy;
    }

    // --------------------------------- Setters
    public void setTextFormatterStrategy(TextFormatterStrategy textFormatterStrategy)
    {
        this.textFormatterStrategy = textFormatterStrategy;
    }

    // ------------------------ Métodos Públicos
    public void format(String text)
    {
        // Delegación por composición
        this.textFormatterStrategy.format(text);
    }

    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        System.out.println("\n_______________________END\n");
    }
}