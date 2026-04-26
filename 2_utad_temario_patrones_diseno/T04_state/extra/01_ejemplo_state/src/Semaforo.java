// Rol: Context

public class Semaforo
{
    // _______________________________ Atributos
    private EstadoSemaforo estado;

    // ___________________________ Constructores
    public Semaforo()
    {
        estado = new Rojo(); // estado inicial
    }

    // _________________________________ Setters
    public void setEstado(EstadoSemaforo estado)
    {
        this.estado = estado;
    }

    // ________________________ Métodos Públicos
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