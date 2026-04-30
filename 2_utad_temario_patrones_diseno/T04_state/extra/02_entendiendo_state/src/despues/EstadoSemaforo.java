package despues;

public interface EstadoSemaforo
{
    // --------------------------------- Getters
    public String getColor();

    // ------------------------ Métodos Públicos
    public String mostrarEstado();

    public boolean puedenPasarCoches();

    public EstadoSemaforo cambiar();
}