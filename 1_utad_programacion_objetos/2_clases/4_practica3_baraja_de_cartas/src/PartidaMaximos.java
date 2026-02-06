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

        // todo testing
        TestMazo miTestMazo = new TestMazo();
        miTestMazo.mostrarMazo(miMazo);

        System.out.println("\n_______________________END\n");
    }
}
