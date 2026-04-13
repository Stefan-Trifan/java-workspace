package antes_del_patron;
public class Usuario
{
    private Impresora impresora;

    public Usuario()
    {
        impresora = new Impresora();
    }

    public void imprimirDocumento()
    {
        impresora.imprimir("Documento del usuario");
    }
}