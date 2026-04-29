package app;

import domain.Book;
import domain.User;
import domain.loan.Loan;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        // crear usuario
        User user = new User("Steve");

        // crear libro
        Book book = new Book("Atomos Atomicos", "El pepe");

        // crear préstamo (Loan)
        Loan loan = new Loan(user, book);

        // llamar a métodos y ver resultados
        // loan.processLoan();
        // loan.processLoan();
        // loan.processLoan();
        // loan.processLoan();

        // System.out.println();
        // System.out.println();
        // System.out.println();

        // crear préstamo (Loan)
        // Loan loan2 = new Loan(user, book);
        // loan2.processLoan();
        // loan2.rejectLoan();

        System.out.println("\n_______________________END\n");
    }
}