
public class MainPatronStrategyTemplate
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");


        // Elegimos la estrategia de procesamiento
        // Elegimos el tipo de archivo
        // Ejecutamos el algoritmo Template

        // CSV
        ProcesadorTemplate contexto = new ProcesadorTemplate(new ProcesadorCSV(), new ProcesadoSimple());
        contexto.procesar();
        System.out.println();

        contexto.setEstrategiaProcesar(new ProcesadoAvanzado());
        contexto.procesar();
        System.out.println();

        contexto.setEstrategiaProcesar(new ProcesadoEstadistico());
        contexto.procesar();
        System.out.println();

        // XML
        contexto.setEstrategiaLeer(new ProcesadorXML());
        contexto.procesar();
        System.out.println();

        contexto.setEstrategiaProcesar(new ProcesadoAvanzado());
        contexto.procesar();
        System.out.println();

        contexto.setEstrategiaProcesar(new ProcesadoEstadistico());
        contexto.procesar();
        System.out.println();

        // PDF
        contexto.setEstrategiaLeer(new ProcesadorPDF());
        contexto.procesar();
        System.out.println();

        contexto.setEstrategiaProcesar(new ProcesadoAvanzado());
        contexto.procesar();
        System.out.println();

        contexto.setEstrategiaProcesar(new ProcesadoEstadistico());
        contexto.procesar();
        System.out.println();

        System.out.println("\n_______________________END\n");
    }
}
