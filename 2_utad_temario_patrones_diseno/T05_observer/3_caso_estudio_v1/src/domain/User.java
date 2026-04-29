package domain;

import domain.loan.*;
import domain.observer.Observer;

public class User implements Observer
{
    // _______________________________ Atributos
    private String name;

    // ___________________________ Constructores
    public User(String name)
    {
        this.name = name;
    }

    // _________________________________ Getters
    // _________________________________ Setters
    // ________________________ Métodos Públicos
    @Override
    public void update(Loan loan)
    {
        System.out.println("[VER NOTIFICACION] -> "
            + loan.getStateLoan().devolverState() + "\n");
    }
    // ________________________ Métodos Privados
}
