public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        MobileFactory mobileFactory = new MobileFactory();
        Mobile phone = mobileFactory.createMobile("Iphone");
        System.out.println(phone.getBrand());

        System.out.println("\n_______________________END\n");
    }
}