public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        MalwareCreator creator = new RansomwareCreator();
        Malware malware = creator.createMalware();

        malware.ejecutar();

        System.out.println("\n_______________________END\n");
    }
}