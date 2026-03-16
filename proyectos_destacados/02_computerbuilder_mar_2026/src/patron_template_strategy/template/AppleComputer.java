package patron_template_strategy.template;

import patron_template_strategy.enums.AppleProcessor;
import patron_template_strategy.strategy.ComputerConfigurationStrategy;

public class AppleComputer extends ComputerBuilder
{
    // _______________________________ Atributos
    private AppleProcessor procesador;

    // ___________________________ Constructores
    public AppleComputer(
        ComputerConfigurationStrategy myStrategy,
        AppleProcessor procesador)
    {
        super(myStrategy);
        this.procesador = procesador;
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
