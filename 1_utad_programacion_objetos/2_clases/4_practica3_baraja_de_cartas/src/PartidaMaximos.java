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
    public static void main(String[] args) throws Exception
    {
        System.out.println("\n_______________________START\n");

        Mazo miMazo = new Mazo();
        miMazo.barajar();

        // Creamos 4 jugadores
        Jugador[] misJugadores = new Jugador[4];

        for(int i = 0; i < misJugadores.length; i++)
        {
            misJugadores[i] = new Jugador();
        }

        misJugadores[0].setNombre("Steve");
        misJugadores[1].setNombre("Valen");
        misJugadores[2].setNombre("Diego");
        misJugadores[3].setNombre("Andres");

        // Repartimos las cartas entre los cuatro jugadores. 
        // 10 cartas cada uno
        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j < misJugadores.length; j++)
            {
                misJugadores[j].addCarta(miMazo.siguienteCarta());
            }
        }

        // Jugamos 10 rondas. Cada ronda un jugador echa una carta
        // Gana la ronda el jugador con la carta mas alta
        // Se termina el juego cuando los jugadores se queden sin cartas
        // Jugamos 10 rondas


        

        System.out.println("\n_______________________END\n");
    }
}
