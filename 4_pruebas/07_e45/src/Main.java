public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        // ScheduleServer scheduleServer = new ScheduleServer();

        // // process of starting server
        // scheduleServer.startBooting();
        // scheduleServer.readSystemConfigFile();
        // scheduleServer.init();
        // scheduleServer.initializeContext();
        // scheduleServer.initializeListeners();
        // scheduleServer.createSystemObjects();

        // System.out.println("Start working......");
        // System.out.println("After work done...........");

        // // process of stopping server
        // scheduleServer.releaseProcesses();
        // scheduleServer.destroy();
        // scheduleServer.destroySystemObjects();
        // scheduleServer.destroyListeners();
        // scheduleServer.destroyContext();
        // scheduleServer.shutdown();

        // ======================
        // despues

        ScheduleServer scheduleServer = new ScheduleServer();
        ScheduleServerFacade facadeServer = new ScheduleServerFacade(scheduleServer);

        facadeServer.startServer();

        System.out.println();
        System.out.println("Start working......");
        System.out.println("After work done...........");
        System.out.println();

        facadeServer.stopServer();

        System.out.println("\n_______________________END\n");
    }
}