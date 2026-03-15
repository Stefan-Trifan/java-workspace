package patrontemplate;

public class MainPatronTemplate
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        ProcesadorTemplate miCSVSimple;
        ProcesadorTemplate miCSVAvanzado;
        ProcesadorTemplate miCSVEstadistico;

        ProcesadorTemplate miXMLSimple;
        ProcesadorTemplate miXMLAvanzado;
        ProcesadorTemplate miXMLEstadistico;

        ProcesadorTemplate miPDFSimple;
        ProcesadorTemplate miPDFAvanzado;
        ProcesadorTemplate miPDFEstadistico;

        // CSV

        miCSVSimple = new ProcesadorCSVSimple();
        miCSVSimple.procesar();
        System.out.println();

        miCSVAvanzado = new ProcesadorCSVAvanzado();
        miCSVAvanzado.procesar();
        System.out.println();

        miCSVEstadistico = new ProcesadorCSVEstadistico();
        miCSVEstadistico.procesar();
        System.out.println();

        // XML

        miXMLSimple = new ProcesadorXMLSimple();
        miXMLSimple.procesar();
        System.out.println();

        miXMLAvanzado = new ProcesadorXMLAvanzado();
        miXMLAvanzado.procesar();
        System.out.println();

        miXMLEstadistico = new ProcesadorXMLEstadistico();
        miXMLEstadistico.procesar();
        System.out.println();

        // PDF

        miPDFSimple = new ProcesadorPDFSimple();
        miPDFSimple.procesar();
        System.out.println();

        miPDFAvanzado = new ProcesadorPDFAvanzado();
        miPDFAvanzado.procesar();
        System.out.println();

        miPDFEstadistico = new ProcesadorPDFEstadistico();
        miPDFEstadistico.procesar();
        System.out.println();

        System.out.println("\n_______________________END\n");
    }
}