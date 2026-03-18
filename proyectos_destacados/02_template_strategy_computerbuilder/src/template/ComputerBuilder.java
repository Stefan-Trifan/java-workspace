package template;

import strategy.ComputerConfigurationStrategy;

// Subclass (Depende de aquitecturta)
// Strategy (Depende de la estrategia)

public abstract class ComputerBuilder
{
    protected ComputerConfigurationStrategy myStrategy;

    public ComputerBuilder(ComputerConfigurationStrategy myStrategy)
    {
        this.myStrategy = myStrategy;
    }

    // ________________________ Métodos Públicos
    public final String buildComputer()
    {
        return prepararPlacaBase() + "\n"
            + addProcesador() + "\n"
            + addRAM() + "\n"
            + addAlmacenamiento() + "\n"
            + addTarjetaGrafica() + "\n"
            + addFuenteDeAlimentacion() + "\n"
            + verificarEnsamblado() + "\n";
    }

    private String prepararPlacaBase()
    {
        return "Preparando placa base por defecto...";
    }

    protected abstract String addProcesador();

    protected abstract String addRAM();

    protected abstract String addAlmacenamiento();

    private String addTarjetaGrafica()
    {
        return "Preparando tarjeta grafica por defecto...";
    }

    private String addFuenteDeAlimentacion()
    {
        return "Preparando placa base por defecto...";
    }

    protected abstract String verificarEnsamblado();
}