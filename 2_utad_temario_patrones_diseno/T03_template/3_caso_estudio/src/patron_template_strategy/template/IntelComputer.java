package patron_template_strategy.template;

import patron_template_strategy.enums.IntelProcessor;
import patron_template_strategy.strategy.ComputerConfigurationStrategy;

public class IntelComputer extends ComputerBuilder
{
    // ------------------------------- Atributos
    private IntelProcessor procesador;

    // --------------------------- Constructores
    public IntelComputer(
        ComputerConfigurationStrategy myStrategy,
        IntelProcessor procesador)
    {
        super(myStrategy);
        this.procesador = procesador;
    }

    // ------------------------ Métodos Públicos
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