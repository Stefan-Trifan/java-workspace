package editor;
import editor.estrategiasconcretas.CamelCaseFormatterStrategy;
import editor.estrategiasconcretas.CapTextFormatter;
import editor.estrategiasconcretas.EchoFormatterStrategy;
import editor.estrategiasconcretas.LowerTextFormatter;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

            // Variables
        TextFormatterStrategy echoFormatterStrategy = new EchoFormatterStrategy();
        TextFormatterStrategy camelCaseFormatterStrategy = new CamelCaseFormatterStrategy();
        TextFormatterStrategy capTextFormatterStrategy = new CapTextFormatter();
        TextFormatterStrategy lowerTextFormatterStrategy = new LowerTextFormatter();

        // Realiza los cambios para que se aplique por defecto la estrategia Echo
        TextEditorContext editor = new TextEditorContext();
        editor.format("Wellcome to this Strategy editor");

        editor.setTextFormatterStrategy(capTextFormatterStrategy);
        editor.format("Testing text in caps formatter");

        editor.setTextFormatterStrategy(lowerTextFormatterStrategy);
        editor.format("Testing text in lower formatter");

        // todo Realiza el cambio para aplicar la estrategia CamelText
        editor.setTextFormatterStrategy(camelCaseFormatterStrategy);
        editor.format("Testing text in camel formatter");

        System.out.println("\n_______________________END\n");
    }
}
