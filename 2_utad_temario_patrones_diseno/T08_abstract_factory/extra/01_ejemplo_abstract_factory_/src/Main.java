public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        GUIFactory factory;

        String sistema = "windows";

        if (sistema.equals("windows"))
        {
            factory = new WindowsFactory();
        }
        else
        {
            factory = new MacFactory();
        }

        App app = new App(factory);

        app.render();

        System.out.println("\n_______________________END\n");
    }
}