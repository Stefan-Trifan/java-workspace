// 3. ADAPTADOR
class XmlToJsonAdapter implements JsonService {

    private XmlService xmlService;

    public XmlToJsonAdapter(XmlService xmlService) {
        this.xmlService = xmlService;
    }

    @Override
    public String getDataAsJson() {

        String xml = xmlService.getDataAsXml();

        // 🔥 EXTRAEMOS el valor real del XML
        String contenido = xml
                .replace("<data>", "")
                .replace("</data>", "");

        // 🔥 LO USAMOS en JSON
        return "{ \"data\": \"" + contenido + "\" }";
    }
}
