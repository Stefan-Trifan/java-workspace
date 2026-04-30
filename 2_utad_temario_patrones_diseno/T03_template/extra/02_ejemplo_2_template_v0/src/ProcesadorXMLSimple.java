public class ProcesadorXMLSimple extends ProcesadorTemplate
{
    // ------------------------------- Atributos
    // --------------------------- Constructores
    // --------------------------------- Getters
    // --------------------------------- Setters
    // ------------------------ Métodos Públicos

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
    // ------------------------ Métodos Privados
}
