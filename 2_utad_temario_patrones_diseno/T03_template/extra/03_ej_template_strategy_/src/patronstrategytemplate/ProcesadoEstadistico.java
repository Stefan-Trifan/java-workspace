package patronstrategytemplate;

public class ProcesadoEstadistico implements ProcesadoStrategy
{
    // _______________________________ Atributos
    // ________________________ Métodos Públicos
    @Override
    public void procesarDatos()
    {
        System.out.println("- Estadistico: Calculando media, moda y mediana");
    }
}
