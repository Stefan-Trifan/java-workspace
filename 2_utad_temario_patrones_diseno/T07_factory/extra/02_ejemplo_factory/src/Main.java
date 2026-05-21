public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        MalwareCreator fabrik = new RansomwareCreator();
        Malware malware = fabrik.createMalware();

        malware.ejecutar();

        System.out.println("\n_______________________END\n");
    }
}