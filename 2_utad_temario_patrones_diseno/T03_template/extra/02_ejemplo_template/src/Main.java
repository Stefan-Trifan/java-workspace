public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        ProcesadorTemplate miCSVSimple = new ProcesadorCSVSimple();
        miCSVSimple.procesar();
        System.out.println();

        ProcesadorTemplate miCSVAvanzado = new ProcesadorCSVAvanzado();
        miCSVAvanzado.procesar();
        System.out.println();

        ProcesadorTemplate miCSVEstadistico = new ProcesadorCSVEstadistico();
        miCSVEstadistico.procesar();
        System.out.println();

        System.out.println("\n_______________________END\n");
    }
}