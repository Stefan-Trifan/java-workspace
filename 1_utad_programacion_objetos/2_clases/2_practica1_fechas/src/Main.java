public class Main
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("\n_______________________START\n");

        Date today = new Date();
        System.out.println(today
            + " cuyo mes tiene " + today.diasMes() + " días");

        Date octubre7 = new Date(7);
        System.out.println(octubre7);

        Date octubre10 = new Date(10, 10);
        System.out.println(octubre10);

        Date octubre10Del2003 = new Date(10, 10, 2003);
        System.out.println(octubre10Del2003);

        if (octubre7.compareTo(octubre10) == -1)
        {
            System.out.println("la fecha "
                +
                octubre7 + " es anterior a " + octubre10);
        }

        System.out.println("\n_______________________END\n");
    }
}