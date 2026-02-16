/* Rol: State (la abstracción)

Es el contrato común que todos los estados deben cumplir.

Define:

“Todo estado del semáforo debe saber qué hacer cuando se llama a cambiar().”

No tiene lógica.
No sabe qué estado es.
Solo define el comportamiento común. */


public interface EstadoSemaforo
{
    void cambiar(Semaforo semaforo);
}       