package domain;

import domain.loan.*;

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
        StateLoan state = loan.getStateLoan();

        System.out.println("[VER NOTIFICACION] -> " + state.devolverState());
    }
    // ________________________ Métodos Privados
}
