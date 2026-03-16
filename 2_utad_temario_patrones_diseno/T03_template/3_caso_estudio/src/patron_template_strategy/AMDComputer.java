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
    protected String addProcesador()
    {
        return "- AMD: Preparando Procesador "
            + procesador
            + " ...";
    }

    protected String addRAM()
    {
        return "- AMD: Preparando "
            + myStrategy.getRAM()
            + " GB de RAM ...";
    }

    protected String addAlmacenamiento()
    {
        return "- AMD: Preparando "
            + myStrategy.getAlmacenamiento()
            + " GB de HDD...";
    }

    protected String verificarEnsamblado()
    {
        return "Listo AMD " + myStrategy.toString();
    }
}
