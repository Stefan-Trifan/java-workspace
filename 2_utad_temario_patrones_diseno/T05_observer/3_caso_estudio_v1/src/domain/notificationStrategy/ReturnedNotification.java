package domain.notificationStrategy;

import domain.Loan;

public class ReturnedNotification implements NotifStrategy
{
    // ________________________ Métodos Públicos
    @Override
    public void notificar(Loan loan)
    {
        System.out.println("[NOTIFICACION]: El pedido ha sido devuelto");
    }
}
