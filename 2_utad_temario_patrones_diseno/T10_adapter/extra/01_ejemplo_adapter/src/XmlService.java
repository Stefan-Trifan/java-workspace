// CLASE EXISTENTE (Adaptee)
class XmlService
{
    // ------------------------------- Atributos
    private String data;

    // --------------------------- Constructores
    public XmlService(String data)
    {
        this.data = data;
    }

    // ------------------------ Métodos Públicos
    public String getDataAsXml()
    {
        return "<data>" + data + "</data>";
    }
}