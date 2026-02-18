public class Main
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("\n_______________________START\n");

        // * ANTES

        // Tablet t = new Tablet(2.0);
        // t.setpeso(3.5);
        // System.out.println(t.imprimirPesos());

        // * AHORA

        Computador c = new Computador(2.0);
        c.setEstrategia(new FormatoKg());
        System.out.println(c.mostrarPeso());

        // c.setEstrategia(new FormatoGr());
        // System.out.println(c.mostrarPeso());

        // Computador t = new Tablet(0.65);
        // t.setEstrategia(new FormatoGr());
        // System.out.println(t.mostrarPeso());

        System.out.println("\n_______________________END\n");
    }
}