package domain;

import domain.*;
import observer.*;
import state.*;
import strategy.*;

// import paquete.*;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        // LoansLibrary library = new LoansLibrary(); // Singleton

        // Book bookGood = new Book(
            // "Gang of four Design patterns",
            // "Gang of four",
            // BookState.GOOD);

        // todo Los docentes tienen 10 dias de préstamo, los alumnos 15 dias.
        // LibraryUser professor = new LibraryUser(
        //     "MA",
        //     "miguel.mesas@u-tad.com",
        //     UserType.PROFESSOR, true);

        // LibraryUser student = new LibraryUser(
        //     "Inés",
        //     "ines@live.u-tad.com",
        //     UserType.STUDENT, true);

        // LibraryLoanRequestContext professorLoanRequest = new LibraryLoanRequestContext(
        //     library,
        //     bookGood,
        //     professor);

        // LibraryLoanRequestContext studentLoanRequest = new LibraryLoanRequestContext(
        //     library,
        //     bookGood,
        //     student);

        // - La biblioteca gestiona las reservas recién creadas
        // library.processLibraryLoan(studentLoanRequest);
        // library.processLibraryLoan(professorLoanRequest);

        // - La biblioteca gestiona la recogida del libro del docente.
        // library.processLibraryLoan(professorLoanRequest);

        // - La biblioteca gestiona la recogida del libro del alumno.
        // library.processLibraryLoan(studentLoanRequest);

        // - La biblioteca gestiona la devolución del libro del alumno.
        // library.returnBook(studentLoanRequest.getBook(), studentLoanRequest);

        // - La biblioteca gestiona la devolución del libro del docente.
        // library.returnBook(professorLoanRequest.getBook(), professorLoanRequest);

        System.out.println("\n_______________________END\n");
    }
}