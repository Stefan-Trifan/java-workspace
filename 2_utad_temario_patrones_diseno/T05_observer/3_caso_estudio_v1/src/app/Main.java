package app;

import domain.Library;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        // crear usuario
        Library biblioAnaMariaMatute = new Library();

        // Creamos prestamos
        System.out.println("Creamos prestamos");
        biblioAnaMariaMatute.crearPrestamoTest();
        biblioAnaMariaMatute.crearPrestamoTest();
        biblioAnaMariaMatute.crearPrestamoTest();
        biblioAnaMariaMatute.crearPrestamoTest();
        biblioAnaMariaMatute.crearPrestamoTest();
        System.out.println();

        System.out.println("Listado");
        biblioAnaMariaMatute.mostrarTodosPrestamos();
        System.out.println();
        System.out.println("Rechazamos todos");
        biblioAnaMariaMatute.rechazarTodosPrestamos();
        System.out.println();
        System.out.println("Listado");
        biblioAnaMariaMatute.mostrarTodosPrestamos();

        System.out.println("\n_______________________END\n");
    }
}

/*
 * - Eliminar imports innecesarios con el comando
 */