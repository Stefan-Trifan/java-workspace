/* 
    Programar un juego del ahorcado. 
    Utilizad una clase Ahorcado. 

    El programa usará una de estas palabras 
    de forma aleatoria en cada ejecución.
*/

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("\n_______________________START\n");

        Scanner sc;
        char letra;
        String[] misPalabras = {
                "Paco", "Pilar", "Eva", "Vanessa",
                "Rafael", "Javier", "Samuel", "Laura"
        };
        JuegoAhorcado miJuegoAhorcado = new JuegoAhorcado(misPalabras, 3);

        System.out.println("Comienzo juego: " + miJuegoAhorcado.getPalabraUsuario());

        do
        {
            System.out.printf("Introduce una letra\n->  ");
            sc = new Scanner(System.in);
            letra = sc.next().charAt(0);
            miJuegoAhorcado.pedirLetra(letra);
        } 
        while (miJuegoAhorcado.getNumVidas() > 0 && miJuegoAhorcado.comprobarVictoria() != 1);

        System.out.println("\n_______________________END\n");
    }
}