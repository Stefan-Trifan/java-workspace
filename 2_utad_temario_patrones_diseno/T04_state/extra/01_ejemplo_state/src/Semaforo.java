// Rol: Context

public class Semaforo
{
    // ------------------------------- Atributos
    private EstadoSemaforo estado;

    // --------------------------- Constructores
    public Semaforo()
    {
        estado = new Rojo(); // estado inicial
    }

    // --------------------------------- Setters
    public void setEstado(EstadoSemaforo estado)
    {
        this.estado = estado;
    }

    // ------------------------ Métodos Públicos
    public void cambiar()
    {
        estado.cambiar(this);
    }
}

/* Ver Info

Es el objeto principal del sistema.
 - Contiene el estado actual.
 - Delegará el comportamiento al estado.
 - No tiene condicionales.
 - No sabe qué transición ocurre. */