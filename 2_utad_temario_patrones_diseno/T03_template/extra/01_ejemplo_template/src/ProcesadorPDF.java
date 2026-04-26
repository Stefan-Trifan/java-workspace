// SUBCLASE

// Solo implementa el paso variable.

public class ProcesadorPDF extends ProcesadorArchivo
{
    @Override
    protected void procesarContenido()
    {
        System.out.println("Procesando contenido PDF...");
    }
}
