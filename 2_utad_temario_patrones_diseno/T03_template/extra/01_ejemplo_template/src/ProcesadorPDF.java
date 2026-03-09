// SUBCLASE

// Solo implementa el paso variable.

public class ProcesadorPDF extends ProcesadorArchivo
{
    @Override
    protected void procesarContenido()
    {
        System.out.println("Procesando contenido PDF...");
    }

    public static void main(String[] args)
    {
        System.out.println("yes");
    }
}
