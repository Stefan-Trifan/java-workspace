public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        // forma completa

        Bebida cafe = new Cafe();
        Bebida cafeConLeche = new ConLeche(new Cafe());
        Bebida cafeCompleto = new ConAzucar(new ConLeche(new Cafe()));

        System.out.printf("%s -> %.2f%n",
            cafe.getDescripcion(),
            cafe.getPrecio());
        System.out.printf("%s -> %.2f%n",
            cafeConLeche.getDescripcion(),
            cafeConLeche.getPrecio());
        System.out.printf("%s -> %.2f%n",
            cafeCompleto.getDescripcion(),
            cafeCompleto.getPrecio());

        // Forma compacta
        System.out.println();

        Bebida cafecito = new Cafe();
        cafecito = new ConLeche(cafecito);
        cafecito = new ConAzucar(cafecito);

        System.out.printf("%s -> %.2f%n",
            cafecito.getDescripcion(),
            cafecito.getPrecio());

        System.out.println("\n_______________________END\n");
    }
}