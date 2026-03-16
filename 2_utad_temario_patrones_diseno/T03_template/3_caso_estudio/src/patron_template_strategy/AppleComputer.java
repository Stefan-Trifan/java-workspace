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
    protected void addProcesador()
    {
        System.out.println(
            "- Apple: Preparando Procesador "
                + procesador
                + " ...");
    }

    protected void addRAM()
    {
        System.out.println(
            "- Apple: Preparando "
                + myStrategy.getRAM()
                + " GB de RAM ...");
    }

    protected void addAlmacenamiento()
    {
        System.out.println(
            "- Apple: Preparando "
                + myStrategy.getAlmacenamiento()
                + " GB de HDD...");
    }

    protected void verificarEnsamblado()
    {
        System.out.println("Listo Apple " + myStrategy.toString());
    }
}
