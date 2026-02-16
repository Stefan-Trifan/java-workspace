/* Rol: Context

Es el objeto principal del sistema.
	•	Contiene el estado actual.
	•	Delegará el comportamiento al estado.
	•	No tiene condicionales.
	•	No sabe qué transición ocurre. */

public class Semaforo
{
    private EstadoSemaforo estado;

    public Semaforo()
    {
        estado = new Rojo(); // estado inicial
    }

    public void setEstado(EstadoSemaforo estado)
    {
        this.estado = estado;
    }

    public void cambiar()
    {
        estado.cambiar(this);
    }
}