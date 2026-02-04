package main;

import e1.*;
import e3.*;
import e4.*;
import e6.*;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("\n_______________________START\n");

        // 1. Crea una interfaz Playable con el método play(). 
        // Luego implementa esa interfaz en dos clases: Guitar y Piano. 
        // Cada una debe mostrar un mensaje diferente al ejecutarse.
        Piano mPiano = new Piano();
        mPiano.play();

        System.out.println("\n_______________________END\n");
    }
}