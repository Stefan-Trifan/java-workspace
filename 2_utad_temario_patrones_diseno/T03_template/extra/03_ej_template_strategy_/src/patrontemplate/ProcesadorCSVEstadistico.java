package patrontemplate;

public class ProcesadorCSVEstadistico extends ProcesadorTemplate
{
    // ________________________ Métodos Públicos
    @Override
    protected void leer()
    {
        System.out.println("- CSV: Parsear columnas");
    }

    @Override
    protected void procesarDatos()
    {
        System.out.println("- Estadistico: Calculando media, moda y mediana");
    }
    // ________________________ Métodos Privados
}
