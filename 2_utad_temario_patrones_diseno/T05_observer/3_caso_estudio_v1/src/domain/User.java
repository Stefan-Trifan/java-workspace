package domain;

import domain.loan.StateLoan;

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
    public void update(StateLoan stateLoan)
    {
        System.out.println(
            "Notificacion Recibida");
    }
    // ________________________ Métodos Privados

}
