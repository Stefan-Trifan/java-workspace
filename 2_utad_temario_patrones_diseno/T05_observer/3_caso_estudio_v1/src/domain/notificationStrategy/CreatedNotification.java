package domain.notificationStrategy;

import domain.Loan;
import domain.stateLoan.*;

public class CreatedNotification implements NotifStrategy
{
    // ________________________ Métodos Públicos
    @Override
    public void notificar(Loan loan)
    {
        System.out.println(
            "[NOTIFICACION]: Hola "
                + loan.getUser().getName()
                + ", solicitud recibida a dia de "
                + loan.getDate()
                + " para el libro \""
                + loan.getBook().getTitulo()
                + "\", de \"" + loan.getBook().getAutor() + "\"");
    }
}
