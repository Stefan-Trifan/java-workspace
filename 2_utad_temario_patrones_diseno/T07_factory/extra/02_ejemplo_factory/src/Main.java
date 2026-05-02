public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        MalwareCreator Kreator = new RansomwareCreator();
        Malware malware = Kreator.createMalware();

        malware.ejecutar();

        System.out.println("\n_______________________END\n");
    }
}