public class ScheduleServerFacade
{
    // ------------------------------- Atributos
    private ScheduleServer server;

    // --------------------------- Constructores
    public ScheduleServerFacade(ScheduleServer server)
    {
        this.server = server;
    }
    // --------------------------------- Getters
    // --------------------------------- Setters
    // ------------------------ Métodos Públicos
    public void startServer()
    {
        server.startBooting();
        server.readSystemConfigFile();
        server.init();
        server.initializeContext();
        server.initializeListeners();
        server.createSystemObjects();
    }

    public void stopServer()
    {
        server.releaseProcesses();
        server.destroy();
        server.destroySystemObjects();
        server.destroyListeners();
        server.destroyContext();
        server.shutdown();
    }
    // ------------------------ Métodos Privados
}
