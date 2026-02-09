public class TextEditor
{

    private TextFormatter textFormatter;

    public TextEditor(TextFormatter textFormatter)
    {
        this.textFormatter = textFormatter;
    }

    public void format(String text)
    {
        textFormatter.format(text);
    }
}
