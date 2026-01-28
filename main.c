/*
    *   Autor
        Stefan Trifan

    *   Estado

    *   Enunciado
        Lorem Ipsum
*/

/* _______________________
   Inicio cabecera */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// Funciones del programa

// Funciones auxiliares
void clearBuffer();

/* _______________________
   Inicio main() */

int main(int argc, char *argv[])
{
    printf("\n_______________________START\n\n");

    // Declaracion de variables


    printf("\n_______________________EXIT\n\n");
    return EXIT_SUCCESS;
}

/* _______________________
   Inicio definicion de funciones */

// Funciones del programa

// Funciones auxiliares
void clearBuffer()
{
    while (getchar() != '\n');
}