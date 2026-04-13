package despues_del_patron_;

public class Administrador
{
    // _______________________________ Atributos
    private Impresora impresora;

    // ___________________________ Constructores
    public Administrador()
    {
        impresora = new Impresora();
    }

    // _________________________________ Getters
    // _________________________________ Setters
    // ________________________ Métodos Públicos
    public void imprimirReporte()
    {
        impresora.imprimir("Reporte del administrador");
    }
    // ________________________ Métodos Privados

}