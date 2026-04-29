package domain.notificationStrategy;

import domain.Loan;
import domain.stateLoan.*;

public interface NotifStrategy
{
    // ________________________ Métodos Privados
    public void notificar(Loan loan);
}
