package domain.stateLoan;

import domain.Loan;
import domain.notificationStrategy.PickedUpNotification;
import domain.notificationStrategy.RejectedNotification;

public class StateAdmitted implements State
{
    // ------------------------ Métodos Públicos

    @Override
    public void cambiar(Loan loan)
    {
        loan.getUser().setNotifStrategy(new PickedUpNotification());
        loan.setState(new StatePickedUp());
    }

    @Override
    public void reject(Loan loan)
    {
        loan.getUser().setNotifStrategy(new RejectedNotification());
        loan.setState(new StateRejected());
    }

    @Override
    public String toString()
    {
        return "Admitted";
    }
}
