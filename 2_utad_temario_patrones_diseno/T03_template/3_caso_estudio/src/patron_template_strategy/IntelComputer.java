package patron_template_strategy;

public class IntelComputer extends ComputerBuilder
{
    // _______________________________ Atributos
    private String procesador;

    // ___________________________ Constructores
    public IntelComputer(
        ComputerConfigurationStrategy myStrategy,
        String myProcesador)
    {
        super(myStrategy);
        this.procesador = myProcesador;
    }

    // ________________________ Métodos Públicos
    protected String addProcesador()
    {
        return "- Intel: Preparando Procesador "
            + procesador
            + " ...";
    }

    protected String addRAM()
    {
        return "- Intel: Preparando "
            + myStrategy.getRAM()
            + " GB de RAM ...";
    }

    protected String addAlmacenamiento()
    {
        return "- Intel: Preparando "
            + myStrategy.getAlmacenamiento()
            + " GB de HDD...";
    }

    protected String verificarEnsamblado()
    {
        return "Listo Intel " + myStrategy.toString();
    }
}