package patron_template;
public class IntelComputer extends ComputerBuilder
{
    // ------------------------------- Atributos
    private String procesador;
    private int    ram;
    private int    almacenamiento;

    // --------------------------- Constructores
    public IntelComputer(String procesador, int ram, int almacenamiento)
    {
        this.procesador = procesador;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
    }

    // --------------------------------- Getters
    // --------------------------------- Setters
    // ------------------------ Métodos Públicos
    protected void addProcesador()
    {
        System.out.println("- Intel: Preparando Procesador " + procesador + " ...");
    }

    protected void addRAM()
    {
        System.out.println("- Intel: Preparando " + ram + " GB de RAM ...");
    }

    protected void addAlmacenamiento()
    {
        System.out.println("- Intel: Preparando " + almacenamiento + " GB de HDD...");
    }
    // ------------------------ Métodos Privados
}
