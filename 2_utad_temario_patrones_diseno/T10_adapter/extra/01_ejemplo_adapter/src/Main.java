public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        XmlService xmlService = new XmlService(
            "Esto ya no está hardcodeado");

        System.out.println(xmlService.getDataAsXml());

        // Usamos el adapter
        JsonService adapter = new XmlToJsonAdapter(xmlService);

        System.out.println(adapter.getDataAsJson());

        System.out.println("\n_______________________END\n");
    }
}