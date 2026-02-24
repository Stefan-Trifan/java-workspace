public class Main
{
    public static void main(String[] args)
    {
        TextFormatterStrategy capTextFormatterStrategy = new CapTextFormatter();
        TextFormatterStrategy lowerTextFormatterStrategy = new LowerTextFormatter();

        // todo Realiza los cambios para que se aplique por defecto la estrategia Echo
        TextEditorContext editor = new TextEditorContext(capTextFormatterStrategy);

        editor.format("Wellcome to this Strategy editor");

        editor.setTextFormatterStrategy(capTextFormatterStrategy);
        editor.format("Testing text in caps formatter");

        editor.setTextFormatterStrategy(lowerTextFormatterStrategy);
        editor.format("Testing text in lower formatter");

        // todo Realiza el cambio para aplicar la estrategia CamelText
        editor.format("Testing text in camel formatter");
    }
}
