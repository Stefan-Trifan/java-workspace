public class PagoPayPal implements PagarStrategy
{
    // ------------------------ Métodos Públicos
    public void pagar()
    {
        System.out.println(
            "Iniciando Sesion en PayPal\n" +
                "Pagando...\n" +
                "Cerrando PayPal");
    }
}
