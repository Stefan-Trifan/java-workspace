public class CamelCaseFormatterStrategy implements TextFormatterStrategy
{
    // ________________________ Métodos Públicos
    @Override
    public void format(String text)
    {
        text = text.toLowerCase();
        String[] words = text.split(" ");
        StringBuilder result = new StringBuilder();


        int i = 0;
        result.append(words[i]);

        for (i = 1; i < words.length; i++)
        {
            result.append(
                words[i].substring(0, 1).toUpperCase()
                + words[i].substring(1));
        }

        System.out.println("[CamelCaseFormatterStrategy]: " + result.toString());
    }

    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        CamelCaseFormatterStrategy miCamelCaseFormatterStrategy = new CamelCaseFormatterStrategy();
        miCamelCaseFormatterStrategy.format("hola a todos");

        System.out.println("\n_______________________END\n");
    }
}
