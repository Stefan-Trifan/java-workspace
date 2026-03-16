public class QuickSoup
{
    // constructor privado
    private QuickSoup()
    {
    }

    // getInstance
    public static QuickSoup makeSoup()
    {
        return new QuickSoup();
    }

    public void ready()
    {
        System.out.println("QuickSoup is ready");
    }
}