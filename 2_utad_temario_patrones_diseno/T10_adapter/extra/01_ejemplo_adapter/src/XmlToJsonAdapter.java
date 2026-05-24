// ADAPTADOR
class XmlToJsonAdapter implements JsonService
{
    // ------------------------------- Atributos
    private XmlService xmlService;

    // --------------------------- Constructores
    public XmlToJsonAdapter(XmlService xmlService)
    {
        this.xmlService = xmlService;
    }

    // ------------------------ Métodos Públicos
    @Override
    public String getDataAsJson()
    {
        String xml = xmlService.getDataAsXml();

        // EXTRAEMOS el valor real del XML
        String contenido = xml
            .replace("<data>", "")
            .replace("</data>", "");

        // 🔥 LO USAMOS en JSON
        return "{ \"data\": \"" + contenido + "\" }";
    }
}
