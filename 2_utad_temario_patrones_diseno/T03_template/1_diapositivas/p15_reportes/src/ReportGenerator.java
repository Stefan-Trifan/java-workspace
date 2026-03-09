// Patrón Template: flujo general del generador de reportes
abstract class ReportGenerator
{
    protected DataRetrievalStrategy strategy;

    public ReportGenerator(DataRetrievalStrategy strategy)
    {
        this.strategy = strategy;
    }

    public final void generateReport()
    {
        String data = getData();
        String formatted = formatData(data);
        export(formatted);
    }

    protected String getData()
    {
        return strategy.getData(); // Delegamos en la estrategia
    }

    protected abstract String formatData(String data);

    protected abstract void export(String formattedData);
}