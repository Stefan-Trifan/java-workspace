public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n______________START\n");

        MobileFactoryManager miMobileFactoryManager = MobileFactoryManager.getInstance();

        // Solicitar al manager la creacion de un mobile
        Mobile phone = miMobileFactoryManager.createMobile();

        System.out.println(phone.getBrand());

        System.out.println("\n______________END\n");
    }
}