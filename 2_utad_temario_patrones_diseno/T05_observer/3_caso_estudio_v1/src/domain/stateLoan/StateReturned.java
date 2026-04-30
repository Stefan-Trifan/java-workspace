package domain.stateLoan;

import domain.Loan;
import domain.notificationStrategy.IllegalOpNotification;

public class StateReturned implements State
{
    // ------------------------ Métodos Públicos

    @Override
    public void cambiar(Loan loan)
    {
        // Prohibido
        loan.getUser().setNotifStrategy(new IllegalOpNotification());
        loan.notifyObservers();
    }

    @Override
    public void reject(Loan loan)
    {
        // Prohibido
        loan.getUser().setNotifStrategy(new IllegalOpNotification());
        loan.notifyObservers();
    }

    @Override
    public String toString()
    {
        return "Returned";
    }
}
