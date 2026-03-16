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
    protected void addProcesador()
    {
        System.out.println(
            "- Intel: Preparando Procesador "
                + procesador
                + " ...");
    }

    protected void addRAM()
    {
        System.out.println(
            "- Intel: Preparando "
                + myStrategy.getRAM()
                + " GB de RAM ...");
    }

    protected void addAlmacenamiento()
    {
        System.out.println(
            "- Intel: Preparando "
                + myStrategy.getAlmacenamiento()
                + " GB de HDD...");
    }

    protected void verificarEnsamblado()
    {
        System.out.println("Listo Intel " + myStrategy.toString());
    }
}

// _________________________________ Getters
// _________________________________ Setters
// ________________________ Métodos Privados