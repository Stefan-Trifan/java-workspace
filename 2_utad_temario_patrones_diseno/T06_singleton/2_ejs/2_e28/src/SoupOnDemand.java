import java.util.Objects;

public class SoupOnDemand
{
    private static SoupOnDemand soupOnDemand;

    private SoupOnDemand()
    {
    } // constructor privado

    public static SoupOnDemand getInstance()
    {
        if (Objects.isNull(soupOnDemand))
        {
            soupOnDemand = new SoupOnDemand();
        }
        return soupOnDemand;
    }

    public void ready()
    {
        System.out.println("Soup on demand is ready");
    }
}