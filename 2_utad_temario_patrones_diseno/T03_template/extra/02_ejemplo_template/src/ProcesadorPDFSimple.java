public class ProcesadorPDFSimple extends ProcesadorTemplate
{
    // _______________________________ Atributos
    // ___________________________ Constructores
    // _________________________________ Getters
    // _________________________________ Setters
    // ________________________ Métodos Públicos

    @Override
    protected void leer()
    {
        System.out.println("- Subclase: Leyendo datos PDF");
    }

    @Override
    protected void procesarDatos()
    {
        System.out.println("- Subclase: Procesando datos PDF");
    }
    // ________________________ Métodos Privados
}
