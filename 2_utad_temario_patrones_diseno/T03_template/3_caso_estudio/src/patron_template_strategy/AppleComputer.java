package patron_template_strategy;

public class AppleComputer extends ComputerBuilder
{
    // _______________________________ Atributos
    private String procesador;

    // ___________________________ Constructores
    public AppleComputer(
        ComputerConfigurationStrategy myStrategy,
        String myProcesador)
    {
        super(myStrategy);
        this.procesador = myProcesador;
    }

    // ________________________ Métodos Públicos
    protected String addProcesador()
    {
        return "- Apple: Preparando Procesador "
            + procesador
            + " ...";
    }

    protected String addRAM()
    {
        return "- Apple: Preparando "
            + myStrategy.getRAM()
            + " GB de RAM ...";
    }

    protected String addAlmacenamiento()
    {
        return "- Apple: Preparando "
            + myStrategy.getAlmacenamiento()
            + " GB de HDD...";
    }

    protected String verificarEnsamblado()
    {
        return "Listo Apple " + myStrategy.toString();
    }
}
