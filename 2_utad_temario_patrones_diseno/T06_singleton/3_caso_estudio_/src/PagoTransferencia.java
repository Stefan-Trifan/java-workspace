public class PagoTransferencia implements PagarStrategy
{
    // ------------------------ Métodos Públicos
    public void pagar()
    {
        System.out.println(
            "Iniciando Sesion en la cuenta del banco\n" +
            "Pagando...\n" +
            "Cerrando Aplicacion del banco");
    }
}
