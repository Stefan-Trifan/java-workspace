// SUBCLASE

// Solo implementa el paso variable.

public class ProcesadorCSV extends ProcesadorArchivo
{
    @Override
    protected void procesarContenido()
    {
        System.out.println("Procesando contenido CSV...");
    }
}
