package despues;

public interface EstadoSemaforo
{
    // _________________________________ Getters
    public String getColor();

    // ________________________ Métodos Públicos
    public String mostrarEstado();

    public boolean puedenPasarCoches();

    public EstadoSemaforo cambiar();
}