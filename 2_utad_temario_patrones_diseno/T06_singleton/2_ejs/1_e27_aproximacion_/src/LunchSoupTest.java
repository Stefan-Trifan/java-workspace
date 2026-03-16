public class LunchSoupTest
{

    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        QuickSoup quickSoup = QuickSoup.makeSoup();
        quickSoup.ready();
        QuickSoup quickSoup2 = QuickSoup.makeSoup();
        quickSoup2.ready();

        System.out.println("\n_______________________END\n");
    }

}