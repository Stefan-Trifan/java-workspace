public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        Bebida cafe = new Cafe();
        System.out.printf("%s -> %.2f%n",
            cafe.getDescripcion(),
            cafe.getPrecio());

        Bebida cafeConLeche = new Leche(new Cafe());
        System.out.printf("%s -> %.2f%n",
            cafeConLeche.getDescripcion(),
            cafeConLeche.getPrecio());

        Bebida cafeCompleto = new Azucar(new Leche(new Cafe()));
        System.out.printf("%s -> %.2f%n",
            cafeCompleto.getDescripcion(),
            cafeCompleto.getPrecio());

        System.out.println("\n_______________________END\n");
    }
}