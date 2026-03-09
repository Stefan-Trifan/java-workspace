public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        DataRetrievalStrategy dbStrategy = new DatabaseStrategy();
        ReportGenerator pdfReport = new PDFReport(dbStrategy);
        pdfReport.generateReport();

        DataRetrievalStrategy apiStrategy = new APIStrategy();
        ReportGenerator htmlReport = new HTMLReport(apiStrategy);
        htmlReport.generateReport();

        System.out.println("\n_______________________END\n");
    }
}