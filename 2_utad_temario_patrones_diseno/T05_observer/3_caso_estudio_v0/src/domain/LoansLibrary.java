package domain;

import domain.*;
import observer.*;
import state.*;
import strategy.*;

public class LoansLibrary extends Library
{
    // _______________________________ Atributos
    // ___________________________ Constructores
    public LoansLibrary()
    {
        super();
    }

    // _________________________________ Getters
    // _________________________________ Setters
    // ________________________ Métodos Públicos
    public void returnBook(Book book, LibraryLoanRequestContext libraryLoanRequestContext)
    {
        // todo devolución y gestión del préstamo
    }

    public void processLibraryLoan(LibraryLoanRequestContext libraryLoanRequestContext)
    {
        // todo ¿Quién debe procesar el préstamo bibliotecario?
    }
    // ________________________ Métodos Privados
}
