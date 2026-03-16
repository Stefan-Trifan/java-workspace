// Programar también una clase PartidaMaximos 
// que reparta todas las cartas entre cuatro jugadores
// , y les ponga a jugar de manera que 
// en cada ronda del juego cada jugador echará una carta
// , ganando la ronda el jugador que haya echado la carta más alta. 

// El juego se acaba cuando los jugadores se quedan sin cartas. 

// Gana la partida el jugador que haya ganado más rondas. 

// En cada ronda se van rotando los turnos de juego de los jugadores
// , esto nos permite asegurar que ante una misma puntuación 
// gane un único jugador. 

// Al finalizar el juego mostrar un mensaje indicando el jugador ganador.

public class PartidaMaximos
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        // Dececlaracion de variables
        Mazo miMazo = new Mazo();
        miMazo.barajar();
        int numJugadores = 4; // todo testing
        int numRondas = 10; // todo testing

        // Creamos un array vacío de 4 jugadores
        Jugador[] misJugadores = new Jugador[numJugadores];

        // Inicializamos los nuevos jugadores
        for (int i = 0; i < misJugadores.length; i++)
            misJugadores[i] = new Jugador();

        // todo testing
        misJugadores[0].setNombre("Steve");
        misJugadores[1].setNombre("Valen");
        misJugadores[2].setNombre("Diego");
        misJugadores[3].setNombre("Andres");

        // Repartimos las cartas entre los jugadores.
        do
        {
            for (int j = 0; j < misJugadores.length; j++)
            {
                misJugadores[j].addCarta(miMazo.siguienteCarta());
            }
        } while (miMazo.numCartasDisponibles() >= misJugadores.length);

        // Jugamos 10 rondas.
        // Cada ronda un jugador echa una carta
        // Gana la ronda el jugador con la carta mas alta
        // Se termina el juego cuando los jugadores se queden sin cartas
        // Jugamos 10 rondas
        // En cada ronda se van rotando los turnos de juego de los jugadores
        // , esto nos permite asegurar que ante una misma puntuación
        // gane un único jugador.
        int iJugadorEmpieza = 0;
        for (int i = 0; i < numRondas; i++)
        {
            int turnoRonda = iJugadorEmpieza;
            int mejorNumero = 1;
            int iGanadorRonda = 0;
            for (int j = 0; j < numJugadores; j++)
            {
                int numeroActual = misJugadores[turnoRonda].darCarta().getNumero();
                if (numeroActual > mejorNumero)
                {
                    iGanadorRonda = turnoRonda;
                    mejorNumero = numeroActual;
                }
                turnoRonda = (turnoRonda + 1) % numJugadores;
            }
            misJugadores[iGanadorRonda].rondaGanada();
            iJugadorEmpieza = (iJugadorEmpieza + 1) % numJugadores;
        }

        // Al finalizar el juego mostrar un mensaje indicando el jugador ganador.
        int iJugadorGanador = 0;
        int minRondasGanadas = 0;
        for (int i = 0; i < misJugadores.length; i++)
        {
            int maxRondasGanadas = misJugadores[i].getRondasGanadas();
            if (maxRondasGanadas > minRondasGanadas)
            {
                minRondasGanadas = maxRondasGanadas;
                iJugadorGanador = i;
            }
        }

        System.out.println("El jugador ganador es: " + misJugadores[iJugadorGanador].getNombre());

        System.out.println("\n_______________________END\n");
    }
}
