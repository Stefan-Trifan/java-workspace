package despues_del_patron_;

public class Usuario
{
    // _______________________________ Atributos
    private Impresora impresora;

    // ___________________________ Constructores
    public Usuario()
    {
        impresora = new Impresora();
    }

    // _________________________________ Getters
    // _________________________________ Setters
    // ________________________ Métodos Públicos
    public void imprimirDocumento()
    {
        impresora.imprimir("Documento del usuario");
    }
    // ________________________ Métodos Privados
}