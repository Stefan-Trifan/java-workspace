package patron_template;
public class AMDComputer extends ComputerBuilder
{
    // _______________________________ Atributos
    private String procesador;
    private int    ram;
    private int    almacenamiento;

    // ___________________________ Constructores
    public AMDComputer(String procesador, int ram, int almacenamiento)
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
        System.out.println("- AMD: Preparando Procesador " + procesador + " ...");
    }

    protected void addRAM()
    {
        System.out.println("- AMD: Preparando " + ram + " GB de RAM DDR4...");
    }

    protected void addAlmacenamiento()
    {
        System.out.println("- AMD: Preparando " + almacenamiento + " GB de HDD...");
    }
    // ________________________ Métodos Privados
}
