package despues;

public class ContextoSemaforo
{
    // ------------------------------- Atributos
    private EstadoSemaforo miEstado;

    // --------------------------- Constructores
    public ContextoSemaforo()
    {
        this.miEstado = new Rojo();
    }

    // --------------------------------- Setters
    public String verColor()
    {
        return miEstado.getColor();
    }

    public void setEstado(EstadoSemaforo estado)
    {
        this.miEstado = estado;
    }

    // ------------------------ Métodos Públicos
    public String mostrarEstado()
    {
        return miEstado.mostrarEstado();
    }

    public boolean puedenPasarCoches()
    {
        return miEstado.puedenPasarCoches();
    }

    public void cambiar()
    {
        this.miEstado = miEstado.cambiar();
    }
}