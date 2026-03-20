package despues;

public class ContextoSemaforo
{
    // _______________________________ Atributos
    private EstadoSemaforo miEstado;

    // ___________________________ Constructores
    public ContextoSemaforo()
    {
        this.miEstado = new Rojo();
    }

    // _________________________________ Setters
    public String verColor()
    {
        return miEstado.getColor();
    }

    public void setEstado(EstadoSemaforo estado)
    {
        this.miEstado = estado;
    }

    // ________________________ Métodos Públicos
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