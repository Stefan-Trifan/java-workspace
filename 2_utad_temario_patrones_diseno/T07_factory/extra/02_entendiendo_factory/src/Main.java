public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        String tipo = "ransomware"; // viene del usuario

        Malware malware = MalwareFactory.createMalware(tipo);

        malware.ejecutar();

        System.out.println("\n_______________________END\n");
    }
}