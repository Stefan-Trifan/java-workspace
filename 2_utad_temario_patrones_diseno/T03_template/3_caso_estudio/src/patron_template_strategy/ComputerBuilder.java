package patron_template_strategy;

// Subclass (Depende de aquitecturta)
// Strategy (Depende de la estrategia)

public abstract class ComputerBuilder
{
    public ComputerConfigurationStrategy myStrategy;

    public ComputerBuilder(ComputerConfigurationStrategy myStrategy)
    {
        this.myStrategy = myStrategy;
    }

    // ________________________ Métodos Públicos
    public final void buildComputer()
    {
        prepararPlacaBase();
        addProcesador(); // Subclass (Depende de aquitecturta)
        addRAM(); // Strategy (Depende de la estrategia)
        addAlmacenamiento(); // Strategy
        addTarjetaGrafica();
        addFuenteDeAlimentacion();
        verificarEnsamblado(); // Subclass
    }

    private void prepararPlacaBase()
    {
        System.out.println("Preparando placa base por defecto...");
    }

    protected abstract void addProcesador();

    protected abstract void addRAM();

    protected abstract void addAlmacenamiento();

    private void addTarjetaGrafica()
    {
        System.out.println("Preparando tarjeta grafica por defecto...");
    }

    private void addFuenteDeAlimentacion()
    {
        System.out.println("Preparando placa base por defecto...");
    }

    protected abstract void verificarEnsamblado();
}