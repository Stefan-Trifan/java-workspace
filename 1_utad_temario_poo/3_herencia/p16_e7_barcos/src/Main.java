public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        Barco miVelero = new Velero("Aaa", 10, 2014, 10);

        System.out.println(miVelero.calcularModulo());

        Alquiler mAlquiler = new Alquiler(
            "Pepe",
            "X8234FA",
            java.time.LocalDate.of(2007, 12, 13),
            java.time.LocalDate.of(2025, 12, 13),
            miVelero);

        System.out.println(mAlquiler.calcularAlquiler());

        System.out.println("\n_______________________END\n");
    }
}