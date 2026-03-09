// Implementación concreta: PDF
class PDFReport extends ReportGenerator
{

    public PDFReport(DataRetrievalStrategy strategy)
    {
        super(strategy);
    }

    protected String formatData(String data)
    {
        return "Formato PDF: " + data;
    }

    protected void export(String formattedData)
    {
        System.out.println("Exportando como PDF: " + formattedData);
    }
}