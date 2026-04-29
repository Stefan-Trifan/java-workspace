package domain;

import java.time.LocalDate;

import domain.notificationStrategy.*;
import domain.stateLoan.*;

public class User implements Observer
{
    // _______________________________ Atributos

    private NotifStrategy notifStrategy;
    private String        name;

    // ___________________________ Constructores

    public User(String name)
    {
        notifStrategy = new CreatedNotification();
        this.name = name;
    }

    // _________________________________ Getters

    public String getName()
    {
        return name;
    }

    // _________________________________ Setters

    public void setNotifStrategy(NotifStrategy notifStrategy)
    {
        this.notifStrategy = notifStrategy;
    }
    // ________________________ Métodos Públicos

    @Override
    public void update(Loan loan)
    {
        notifStrategy.notificar(loan);
    }
    // ________________________ Métodos Privados
}
