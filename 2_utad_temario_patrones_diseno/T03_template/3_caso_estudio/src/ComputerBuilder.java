public abstract class ComputerBuilder
{
    // _______________________________ Atributos
    // ___________________________ Constructores
    // _________________________________ Getters
    // _________________________________ Setters
    // ________________________ Métodos Públicos
    public final void buildComputer()
    {
        prepararPlacaBase();
        addProcesador();
        addRAM();
        addAlmacenamiento();
        addTarjetaGrafica();
        addFuenteDeAlimentacion();
        verificarEnsamblado();
    }

    private void prepararPlacaBase()
    {
        System.out.println("Preparando placa base por defecto...");
    }

    protected abstract void addProcesador(); // Subclass

    protected abstract void addRAM(); // Subclass

    protected abstract void addAlmacenamiento(); // Subclass

    private void addTarjetaGrafica()
    {
        System.out.println("Preparando tarjeta grafica por defecto...");
    }

    private void addFuenteDeAlimentacion()
    {
        System.out.println("Preparando placa base por defecto...");
    }

    private void verificarEnsamblado()
    {
        System.out.println("Listo");

    }
    // ________________________ Métodos Privados
}
