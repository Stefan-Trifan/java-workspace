public class ProcesadorCSVEstadistico extends ProcesadorTemplate
{
    // ------------------------------- Atributos
    // --------------------------- Constructores
    // --------------------------------- Getters
    // --------------------------------- Setters
    // ------------------------ Métodos Públicos
    @Override
    protected void leer()
    {
        System.out.println("- Subclase CSV Estadistico: Leyendo datos");
    }

    @Override
    protected void procesarDatos()
    {
        System.out.println("- Subclase CSV Estadistico: Procesando datos");
    }
    // ------------------------ Métodos Privados
}
