package patron_template;
public class IntelComputer extends ComputerBuilder
{
    // _______________________________ Atributos
    private String procesador;
    private int    ram;
    private int    almacenamiento;

    // ___________________________ Constructores
    public IntelComputer(String procesador, int ram, int almacenamiento)
    {
        this.procesador = procesador;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
    }

    // _________________________________ Getters
    // _________________________________ Setters
    // ________________________ Métodos Públicos
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
    // ________________________ Métodos Privados
}
