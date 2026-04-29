package domain;

import java.time.LocalDate;

import domain.stateLoan.State;
import domain.stateLoan.StateCreated;

public class Loan
{
    // _______________________________ Atributos

    private User      user;
    private Book      book;
    private State     state;
    private LocalDate date;

    // ___________________________ Constructores

    public Loan(User user, Book book)
    {
        this.user = user;
        this.book = book;
        date = LocalDate.now();
        this.state = new StateCreated();
        notifyObservers();
    }
    // _________________________________ Getters

    public LocalDate getDate()
    {
        return date;
    }

    public User getUser()
    {
        return user;
    }

    public Book getBook()
    {
        return book;
    }

    public State getState()
    {
        return state;
    }

    // _________________________________ Setters
    // ________________________ Métodos Públicos

    public void processLoan()
    {
        state.cambiar(this);
    }

    public void rejectLoan()
    {
        state.reject(this);
    }

    public void setState(State state)
    {
        this.state = state;
        notifyObservers();
    }

    public void notifyObservers()
    {
        user.update(this);
    }

    // ________________________ Métodos Privados

}
