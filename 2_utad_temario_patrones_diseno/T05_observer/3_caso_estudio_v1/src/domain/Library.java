package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import domain.stateLoan.StateReturned;

public class Library
{
    // _______________________________ Atributos
    private List<Loan> listaPrestamos;
    private Scanner    sc;
    private int        contadorPrestamos;

    // ___________________________ Constructores
    public Library()
    {
        listaPrestamos = new ArrayList<>();
        sc = new Scanner(System.in);
        contadorPrestamos = 0;
    }

    // _________________________________ Getters
    // _________________________________ Setters
    // ________________________ Métodos Públicos
    public void crearPrestamo()
    {
        System.out.printf("Introduce nombre ususario:\n-> ");
        User newUser = new User(sc.nextLine());

        System.out.printf("Introduce nombre libro\n-> ");
        String nombreLibro = sc.nextLine();

        System.out.printf("Introduce nombre autor\n-> ");
        String nombreAutor = sc.nextLine();

        Book newBook = new Book(nombreLibro, nombreAutor);

        listaPrestamos.add(new Loan(newUser, newBook));
        contadorPrestamos++;
    }

    public void crearPrestamoTest()
    {
        String nombreUsuario = "[USER " + contadorPrestamos + "]";
        String nombreLibro = "[LIBRO " + contadorPrestamos + "]";
        String nombreAutor = "[AUTOR " + contadorPrestamos + "]";

        User newUser = new User(nombreUsuario);
        Book newBook = new Book(nombreLibro, nombreAutor);

        listaPrestamos.add(new Loan(newUser, newBook));
        contadorPrestamos++;
    }

    public void procesarPrestamos()
    {
        // Ejecuta el siguiente paso del ciclo de vida del préstamo (usa State)
        for (Loan loan : listaPrestamos)
        {
            loan.processLoan();
        }

    }

    public void rechazarTodosPrestamos()
    {
        // Rechaza un préstamo en función de su estado actual
        for (Loan loan : listaPrestamos)
        {
            loan.rejectLoan();
        }
    }

    public void devolverTodosLibros()
    {
        // Gestiona la devolución de un libro y avanza el estado del préstamo
        for (Loan loan : listaPrestamos)
        {
            while (!(loan.getState() instanceof StateReturned))
            {
                loan.processLoan();
            }
        }

    }

    public void eliminarTodosPrestamos()
    {
        listaPrestamos.clear();
    }

    public void mostrarTodosPrestamos()
    {
        // Muestra por consola todos los préstamos gestionados por la biblioteca
        for (Loan loan : listaPrestamos)
        {
            System.out.println(
                "[" + loan.getState() + "]"
                    + loan.getUser().getName()
                    + loan.getDate()
                    + loan.getBook().getTitulo()
                    + loan.getBook().getAutor());
        }
    }
    // ________________________ Métodos Privados
}
