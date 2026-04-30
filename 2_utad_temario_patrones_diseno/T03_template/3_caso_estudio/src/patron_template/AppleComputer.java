package patron_template;
public class AppleComputer extends ComputerBuilder
{
    // ------------------------------- Atributos
    private String procesador;
    private int    ram;
    private int    almacenamiento;

    // --------------------------- Constructores
    public AppleComputer(String procesador, int ram, int almacenamiento)
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
        System.out.println("- Apple: Preparando Procesador " + procesador + " ...");
    }

    protected void addRAM()
    {
        System.out.println("- Apple: Preparando " + ram + " GB de RAM DDR4...");
    }

    protected void addAlmacenamiento()
    {
        System.out.println("- Apple: Preparando " + almacenamiento + " GB de HDD...");
    }
    // ------------------------ Métodos Privados
}
