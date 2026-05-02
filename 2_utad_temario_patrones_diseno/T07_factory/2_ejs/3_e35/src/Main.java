public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n______________START\n");


        // Solicitar al manager la creacion de un mobile
        MobileFactoryManager miMobileFactoryManager = MobileFactoryManager.getInstance();
        miMobileFactoryManager.setMobileFactory(new SpanishFactory());

        Mobile phone = miMobileFactoryManager.createMobile(TypeMobile.SAMSUNG);

        System.out.println(phone.getBrand() + " language " + phone.getLanguage());

        System.out.println("\n______________END\n");
    }
}