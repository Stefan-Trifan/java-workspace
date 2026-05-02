import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        GestorPagos miGestor = GestorPagos.getInstance();

        miGestor.pay();

        miGestor.setMetodoPago(new PagoPayPal());
        miGestor.pay();

        System.out.println("\n_______________________END\n");
    }
}