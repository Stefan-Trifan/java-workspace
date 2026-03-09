// Implementación concreta: HTML
class HTMLReport extends ReportGenerator
{

    public HTMLReport(DataRetrievalStrategy strategy)
    {
        super(strategy);
    }

    protected String formatData(String data)
    {
        return "<html><body>" + data + "</body></html>";
    }

    protected void export(String formattedData)
    {
        System.out.println("Exportando como HTML: " + formattedData);
    }
}