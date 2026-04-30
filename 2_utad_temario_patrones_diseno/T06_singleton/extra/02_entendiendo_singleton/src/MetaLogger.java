public class MetaLogger
{
    // ------------------------------- Atributos

    private static MetaLogger instance = new MetaLogger();
    private int               logsCount;

    // --------------------------- Constructores

    private MetaLogger()
    {
        this.logsCount = 0;
    }
    // ------------------------ Métodos Públicos

    /**
     * Para evitar problemas de rendimiento se puede utilizar synchronized o voltaire.
     * Synchronized da problemas de rendimiento
     * @return
     */
    public static MetaLogger getInstance()
    {
        return instance;
    }

    public void log(String message)
    {
        logsCount++;
        System.out.println("[LOG " + logsCount + "] " + message);
    }

}