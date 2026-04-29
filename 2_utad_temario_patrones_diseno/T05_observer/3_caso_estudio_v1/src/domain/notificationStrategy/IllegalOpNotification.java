package domain.notificationStrategy;

import domain.Loan;

public class IllegalOpNotification implements NotifStrategy
{
    // ________________________ Métodos Públicos
    @Override
    public void notificar(Loan loan)
    {
        System.out.println("[NOTIFICACION]: Ojito, Operacion Prohibida");
    }
}
