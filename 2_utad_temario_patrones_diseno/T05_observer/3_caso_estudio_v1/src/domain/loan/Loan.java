package domain.loan;

// Contexto para patron State
// Observable para patron Observer

import domain.Book;
import domain.User;

public class Loan
{
    // _______________________________ Atributos
    private User      user;
    private Book      book;
    private StateLoan stateLoan;

    // ___________________________ Constructores
    public Loan(User user, Book book)
    {
        this.user = user;
        this.book = book;
        this.stateLoan = new StateCreated();
    }

    // _________________________________ Getters
    public StateLoan getStateLoan()
    {
        return stateLoan;
    }

    // _________________________________ Setters
    public void setState(StateLoan stateLoan)
    {
        this.stateLoan = stateLoan;
        notifyObservers();
    }

    // ________________________ Métodos Públicos
    public void processLoan()
    {
        stateLoan.cambiar(this);
    }

    public void rejectLoan()
    {
        stateLoan.reject(this);
    }

    public void notifyObservers()
    {
        user.update(this);
    }

    // ________________________ Métodos Privados

}
