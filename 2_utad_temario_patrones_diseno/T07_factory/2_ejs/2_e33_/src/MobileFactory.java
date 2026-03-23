public class MobileFactory
{
    public Mobile createMobile(String brand)
    {
        if (brand.equals("Iphone"))
        {
            return new Iphone();
        }
        else
        {
            return new SamsungPhone();
        }
    }
}