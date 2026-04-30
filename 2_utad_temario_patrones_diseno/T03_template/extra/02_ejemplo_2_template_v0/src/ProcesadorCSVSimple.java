public class ProcesadorCSVSimple extends ProcesadorTemplate
{
    // ------------------------------- Atributos
    // --------------------------- Constructores
    // --------------------------------- Getters
    // --------------------------------- Setters
    // ------------------------ Métodos Públicos
    @Override
    protected void leer()
    {
        System.out.println("- Subclase CSV Simple: Leyendo datos");
    }

    @Override
    protected void procesarDatos()
    {
        System.out.println("- Subclase CSV Simple: Procesando datos");
    }
    // ------------------------ Métodos Privados
}
