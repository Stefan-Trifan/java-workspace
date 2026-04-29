package domain.loan;

public class StatePickedUp implements StateLoan
{
    // ________________________ Métodos Públicos
    public String devolverState()
    {
        return "Estado = PICKED_UP\n";
    }

    public void cambiar(Loan loan)
    {
        System.out.println("Cambiando estado a RETURNED");
        loan.setState(new StateReturned());
    }

    public void reject(Loan loan)
    {
        System.out.println("Advertencia: Operacion Prohibida");
    }
}
