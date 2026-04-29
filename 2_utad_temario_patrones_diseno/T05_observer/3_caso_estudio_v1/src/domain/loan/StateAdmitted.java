package domain.loan;

public class StateAdmitted implements StateLoan
{
    // ________________________ Métodos Públicos

    public String devolverState()
    {
        return "Estado = ADMITTED";
    }

    public void cambiar(Loan loan)
    {
        System.out.println("Cambiando estado a PICKED_UP");
        loan.setState(new StatePickedUp());
    }

    public void reject(Loan loan)
    {
        System.out.println("Cambiando estado a Rejected");
        loan.setState(new StateRejected());
    }
}
