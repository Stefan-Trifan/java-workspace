public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        SingletonSoup singletonSoup = SingletonSoup.getInstance();
        singletonSoup.ready();
        singletonSoup.ready(EnumSingleton.INSTANCE.getInfo());

        // todo Escribid un mensaje System.out.println
        // pasando por parámetro la hora de inicio de la clase de los martes.
        // Utiliza la información del enumerado EnumClassDay
        System.out.println(
            "On tuesday, this class starts at " +
                EnumClassDay.MARTES.getStartHour() +
                " hours"
        );

        System.out.println("\n_______________________END\n");
    }
}