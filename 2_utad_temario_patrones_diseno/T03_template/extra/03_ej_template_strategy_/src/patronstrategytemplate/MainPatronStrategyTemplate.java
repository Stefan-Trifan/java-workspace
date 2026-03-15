package patronstrategytemplate;
public class MainPatronStrategyTemplate
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");


        // Elegimos la estrategia de procesamiento
        // Elegimos el tipo de archivo
        // Ejecutamos el algoritmo Template

        ProcesadoStrategy estrategia;
        ProcesadorTemplate contexto;

        // CSV

        estrategia = new ProcesadoSimple();
        contexto = new ProcesadorCSV(estrategia);
        contexto.procesar();
        System.out.println();

        estrategia = new ProcesadoAvanzado();
        contexto = new ProcesadorCSV(estrategia);
        contexto.procesar();
        System.out.println();

        estrategia = new ProcesadoEstadistico();
        contexto = new ProcesadorCSV(estrategia);
        contexto.procesar();
        System.out.println();

        // XML

        estrategia = new ProcesadoSimple();
        contexto = new ProcesadorXML(estrategia);
        contexto.procesar();
        System.out.println();

        estrategia = new ProcesadoAvanzado();
        contexto = new ProcesadorXML(estrategia);
        contexto.procesar();
        System.out.println();

        estrategia = new ProcesadoEstadistico();
        contexto = new ProcesadorXML(estrategia);
        contexto.procesar();
        System.out.println();

        // PDF

        estrategia = new ProcesadoSimple();
        contexto = new ProcesadorPDF(estrategia);
        contexto.procesar();
        System.out.println();

        estrategia = new ProcesadoAvanzado();
        contexto = new ProcesadorPDF(estrategia);
        contexto.procesar();
        System.out.println();

        estrategia = new ProcesadoEstadistico();
        contexto = new ProcesadorPDF(estrategia);
        contexto.procesar();
        System.out.println();

        System.out.println("\n_______________________END\n");
    }
}
