public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        ProcesadorArchivo pdf = new ProcesadorPDF();
        pdf.procesar();

        System.out.println();

        ProcesadorArchivo csv = new ProcesadorCSV();
        csv.procesar();

        System.out.println("\n_______________________END\n");
    }
}