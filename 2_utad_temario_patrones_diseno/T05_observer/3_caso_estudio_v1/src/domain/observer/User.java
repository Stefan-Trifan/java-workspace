package domain.observer;

import domain.Loan;
import domain.notificationStrategy.CreatedNotification;
import domain.notificationStrategy.NotifStrategy;

public class User implements Observer
{
    // ------------------------------- Atributos

    private NotifStrategy notifStrategy;
    private String        name;

    // --------------------------- Constructores

    public User(String name)
    {
        notifStrategy = new CreatedNotification();
        this.name = name;
    }

    // --------------------------------- Getters

    public String getName()
    {
        return name;
    }

    // --------------------------------- Setters

    public void setNotifStrategy(NotifStrategy notifStrategy)
    {
        this.notifStrategy = notifStrategy;
    }
    // ------------------------ Métodos Públicos

    @Override
    public void update(Loan loan)
    {
        notifStrategy.notificar(loan);
    }
    // ------------------------ Métodos Privados
}
