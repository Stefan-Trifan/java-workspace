package patron_template_strategy;
public class AMDComputer extends ComputerBuilder
{
    // _______________________________ Atributos
    private String procesador;

    // ___________________________ Constructores
    public AMDComputer(
        ComputerConfigurationStrategy myStrategy,
        String myProcesador)
    {
        super(myStrategy);
        this.procesador = myProcesador;
    }

    // ________________________ Métodos Públicos
    protected void addProcesador()
    {
        System.out.println(
            "- AMD: Preparando Procesador "
                + procesador
                + " ...");
    }

    protected void addRAM()
    {
        System.out.println(
            "- AMD: Preparando "
                + myStrategy.getRAM()
                + " GB de RAM ...");
    }

    protected void addAlmacenamiento()
    {
        System.out.println(
            "- AMD: Preparando "
                + myStrategy.getAlmacenamiento()
                + " GB de HDD...");
    }

    protected void verificarEnsamblado()
    {
        System.out.println("Listo AMD " + myStrategy.toString());
    }
}
