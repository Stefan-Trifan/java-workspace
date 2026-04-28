package domain;

import java.time.LocalDate;

import domain.*;
import observer.*;
import state.*;
import strategy.*;

public class LibraryLoanRequestContext
{
    // _______________________________ Atributos
    // private Tipo1¿¿¿??? currentState;
    // private Tipo1 ¿¿¿??? Tipo2¿¿¿?? x;
    // private TipoX y;
    // private TipoX z;

    // Necesitaremos un modelo observable
    // sujeto a diferentes tipos de notificaciones
    // ...

    private LibraryUser  libraryUser; // Composicion debil
    private LoansLibrary loansLibrary;
    private Book         book;
    private LocalDate    createdDate;
    private LocalDate    pickupDate;

    // ___________________________ Constructores
    public LibraryLoanRequestContext(
        LoansLibrary loansLibrary,
        Book book,
        LibraryUser libraryUser)
    {
        super();
        this.loansLibrary = loansLibrary;
        this.book = book;
        this.libraryUser = libraryUser;
        // todo ¿Cómo indicamos que la reserva comienza en estado Creada?
    }

    // _________________________________ Getters
    // _________________________________ Setters
    // ________________________ Métodos Públicos
    public void process()
    {
        // todo ¿Quién debe procesar este método?
    }
    // ________________________ Métodos Privados

}
