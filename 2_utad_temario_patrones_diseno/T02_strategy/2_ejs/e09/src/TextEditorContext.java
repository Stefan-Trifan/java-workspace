public class TextEditorContext
{
    private TextFormatterStrategy textFormatterStrategy;

    public TextEditorContext(TextFormatterStrategy textFormatterStrategy)
    {
        this.textFormatterStrategy = textFormatterStrategy;
    }

    public TextFormatterStrategy getTextFormatterStrategy()
    {
        return this.textFormatterStrategy;
    }

    public void setTextFormatterStrategy(TextFormatterStrategy textFormatterStrategy)
    {
        this.textFormatterStrategy = textFormatterStrategy;
    }

    public void format(String text)
    {
        // Delegación por composición
        this.textFormatterStrategy.format(text);
    }
}