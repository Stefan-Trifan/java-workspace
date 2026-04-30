package domain.notificationStrategy;

import domain.Loan;

public class AdmittedNotification implements NotifStrategy
{
    // ------------------------ Métodos Públicos
    @Override
    public void notificar(Loan loan)
    {
        System.out.println("[NOTIFICACION]: El pedido ha sido admitido");
    }
}
