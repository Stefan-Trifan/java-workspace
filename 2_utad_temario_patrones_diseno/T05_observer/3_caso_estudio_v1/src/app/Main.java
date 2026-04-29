package app;

import domain.Book;
import domain.Library;
import domain.Loan;
import domain.User;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        // crear usuario
        Library biblioAnaMariaMatute = new Library();

        // Creamos 2 prestamos
        biblioAnaMariaMatute.crearPrestamoTest();
        biblioAnaMariaMatute.crearPrestamoTest();
        biblioAnaMariaMatute.crearPrestamoTest();
        biblioAnaMariaMatute.crearPrestamoTest();
        biblioAnaMariaMatute.crearPrestamoTest();

        biblioAnaMariaMatute.mostrarTodosPrestamos();
        biblioAnaMariaMatute.rechazarTodosPrestamos();
        biblioAnaMariaMatute.mostrarTodosPrestamos();

        System.out.println("\n_______________________END\n");
    }
}

/*
 * - Eliminar imports innecesarios con el comando
 */