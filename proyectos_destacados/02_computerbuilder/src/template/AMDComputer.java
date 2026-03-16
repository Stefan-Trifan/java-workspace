package template;

import enums.AMDProcessor;
import strategy.ComputerConfigurationStrategy;

public class AMDComputer extends ComputerBuilder
{
    // _______________________________ Atributos
    private AMDProcessor procesador;

    // ___________________________ Constructores
    public AMDComputer(
        ComputerConfigurationStrategy myStrategy,
        AMDProcessor procesador)
    {
        super(myStrategy);
        this.procesador = procesador;
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
