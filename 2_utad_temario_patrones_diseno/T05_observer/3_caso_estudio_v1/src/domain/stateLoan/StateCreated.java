package domain.stateLoan;

import domain.Loan;
import domain.notificationStrategy.AdmittedNotification;
import domain.notificationStrategy.RejectedNotification;

public class StateCreated implements State
{

    // ________________________ Métodos Públicos

    @Override
    public void cambiar(Loan loan)
    {
        loan.getUser().setNotifStrategy(new AdmittedNotification());
        loan.setState(new StateAdmitted());
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
        return "Created";
    }
}
