public class Administrador
{
    private Impresora impresora;

    public Administrador()
    {
        impresora = new Impresora();
    }

    public void imprimirReporte()
    {
        impresora.imprimir("Reporte del administrador");
    }
}