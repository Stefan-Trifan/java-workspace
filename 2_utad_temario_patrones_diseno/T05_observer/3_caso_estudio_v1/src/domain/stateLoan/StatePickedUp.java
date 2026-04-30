package domain.stateLoan;

import domain.Loan;
import domain.notificationStrategy.IllegalOpNotification;
import domain.notificationStrategy.ReturnedNotification;

public class StatePickedUp implements State
{
    // ------------------------ Métodos Públicos

    @Override
    public void cambiar(Loan loan)
    {
        loan.getUser().setNotifStrategy(new ReturnedNotification());
        loan.setState(new StateReturned());
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
        return "Picked Up";
    }
}
