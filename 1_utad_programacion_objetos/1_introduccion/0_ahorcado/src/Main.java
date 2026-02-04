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

        String[] misPalabras = {
                "Paco", "Pilar", "Eva", "Vanessa",
                "Rafael", "Javier", "Samuel", "Laura"
        };

        JuegoAhorcado miJuegoAhorcado = new JuegoAhorcado(misPalabras, 3);

        System.out.println(miJuegoAhorcado.getPalabraUsuario());

        
        System.out.print("Introduce una letra: ");
        

        System.out.println("\n_______________________END\n");
    }
}