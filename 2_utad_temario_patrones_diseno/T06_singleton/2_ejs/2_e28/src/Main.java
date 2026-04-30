public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        QuickSoup quickSoup = QuickSoup.getInstance();
        quickSoup.ready();

        // todo Ej1: 'conseguir' la instancia de SoupOnDemand
        // todo invocar el método ready
        SoupOnDemand soupOnDemand = SoupOnDemand.getInstance();
        soupOnDemand.ready();

        System.out.println("\n_______________________END\n");
    }
}