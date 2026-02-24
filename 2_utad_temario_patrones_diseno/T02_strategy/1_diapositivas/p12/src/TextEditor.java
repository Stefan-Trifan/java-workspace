public class TextEditor
{
    private TextFormatter textFormatter;

    public TextEditor(TextFormatter textFormatter)
    {
        this.textFormatter = textFormatter;
    }

    public void fmt(String text)
    {
        textFormatter.format(text);
    }
}
