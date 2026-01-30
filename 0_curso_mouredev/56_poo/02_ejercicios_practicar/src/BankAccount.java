public class BankAccount
{
    // Atributos
    private double balance = 0;

    // Getter
    public double getBalance()
    {
        return this.balance;
    }

    // Métodos
    public void deposit(double amount)
    {
        if (amount > 0)
        {
            this.balance += amount;
        }
    }

    public void withdraw(double amount)
    {
        if (this.balance - amount >= 0)
        {
            this.balance -= amount;
        }

    }
}
