package template;

import enums.AppleProcessor;
import strategy.ComputerConfigurationStrategy;

public class AppleComputer extends ComputerBuilder
{
    // ------------------------------- Atributos
    private AppleProcessor procesador;

    // --------------------------- Constructores
    public AppleComputer(
        ComputerConfigurationStrategy myStrategy,
        AppleProcessor procesador)
    {
        super(myStrategy);
        this.procesador = procesador;
    }

    // ------------------------ Métodos Públicos
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
