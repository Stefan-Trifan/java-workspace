package domain.loan;

public class StatePickedUp implements StateLoan
{
    // ________________________ Métodos Públicos
    public void cambiar(Loan loan)
    {
        System.out.println("Cambiando estado a RETURNED");
        loan.setState(new StateReturned());
        System.out.println("Estado = RETURNED\n");
    }

    public void reject(Loan loan)
    {
        System.out.println("Advertencia: Operacion Prohibida");
    }
}
