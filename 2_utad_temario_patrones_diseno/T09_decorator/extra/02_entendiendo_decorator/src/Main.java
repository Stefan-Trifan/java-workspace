public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        // Antes
        // Bebida cafe = new Cafe();
        // Bebida cafeLeche = new CafeConLeche();
        // Bebida cafeAzucar = new CafeConAzucar();
        // Bebida cafeCompleto = new CafeConLecheYAzucar();

        // System.out.println(cafe.getDescripcion() + " -> " + cafe.getPrecio());
        // System.out.println(cafeLeche.getDescripcion() + " -> " + cafeLeche.getPrecio());
        // System.out.println(cafeAzucar.getDescripcion() + " -> " + cafeAzucar.getPrecio());
        // System.out.println(cafeCompleto.getDescripcion() + " -> " + cafeCompleto.getPrecio());

        Bebida cafecito = new Cafe();
        cafecito = new ConLeche(cafecito);
        cafecito = new ConAzucar(cafecito);

        System.out.printf("%s -> %.2f%n",
            cafecito.getDescripcion(),
            cafecito.getPrecio());

        System.out.println("\n_______________________END\n");
    }
}