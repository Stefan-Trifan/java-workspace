package domain;

import java.time.LocalDate;

import domain.observer.User;
import domain.stateLoan.State;
import domain.stateLoan.StateCreated;

public class Loan
{
    // ------------------------------- Atributos
    private User      user;
    private Book      book;
    private State     state;
    private LocalDate date;
    // --------------------------- Constructores
    public Loan(User user, Book book)
    {
        this.user = user;
        this.book = book;
        date = LocalDate.now();
        this.state = new StateCreated();
        notifyObservers();
    }
    // --------------------------------- Getters
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
    // --------------------------------- Setters
    // ------------------------ Métodos Públicos
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
    // ------------------------ Métodos Privados
}
