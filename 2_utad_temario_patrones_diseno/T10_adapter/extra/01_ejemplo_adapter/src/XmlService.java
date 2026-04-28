// 2. CLASE EXISTENTE (Adaptee)
class XmlService {

    private String data;

    public XmlService(String data) {
        this.data = data;
    }

    public String getDataAsXml() {
        return "<data>" + data + "</data>";
    }
}