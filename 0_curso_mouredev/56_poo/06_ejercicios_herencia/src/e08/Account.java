package e08;
public class Account
{
    // Atributos
    public int saldo = 0;

    // Constructores

    // Getters

    // Setters

    // Métodos públicos
    public void deposit(int euros) 
    {
        saldo += euros;
    }

    public void withdraw(int euros)
    {
        saldo -= euros;
    }

    // Métodos privados
}
