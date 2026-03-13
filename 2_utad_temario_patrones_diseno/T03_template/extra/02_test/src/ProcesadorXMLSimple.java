public class ProcesadorXMLSimple extends ProcesadorTemplate
{
    // _______________________________ Atributos
    // ___________________________ Constructores
    // _________________________________ Getters
    // _________________________________ Setters
    // ________________________ Métodos Públicos

    @Override
    protected void leer()
    {
        System.out.println("- Subclase: Leyendo datos XML");
    }

    @Override
    protected void procesarDatos()
    {
        System.out.println("- Subclase: Procesando datos XML");
    }
    // ________________________ Métodos Privados
}
