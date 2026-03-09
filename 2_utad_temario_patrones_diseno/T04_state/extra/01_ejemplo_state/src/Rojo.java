public class Rojo implements EstadoSemaforo
{
    @Override
    public void cambiar(Semaforo semaforo)
    {
        System.out.println("Semáforo en ROJO → Cambia a VERDE");
        semaforo.setEstado(new Verde());
    }
}

/* Rol: Concrete State

Cada uno representa:
    •	Un estado concreto
    •	Un comportamiento específico
    •	Una transición concreta

Por ejemplo:
    •	Rojo → decide que el siguiente estado es Verde
    •	Verde → decide que el siguiente es Amarillo
    •	Amarillo → decide que el siguiente es Rojo

Clave:
Cada estado conoce la transición.
El contexto no. */