public class ScheduleServerFacade
{
    // _______________________________ Atributos
    private ScheduleServer server;

    // ___________________________ Constructores
    public ScheduleServerFacade(ScheduleServer server)
    {
        this.server = server;
    }
    // _________________________________ Getters
    // _________________________________ Setters
    // ________________________ Métodos Públicos
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
    // ________________________ Métodos Privados
}
