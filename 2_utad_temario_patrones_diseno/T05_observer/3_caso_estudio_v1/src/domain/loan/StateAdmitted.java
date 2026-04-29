package domain.loan;

public class StateAdmitted implements StateLoan
{
    // ________________________ Métodos Públicos
    public String devolverState()
    {
        return "Estado = ADMITTED\n";
    }

    public void cambiar(Loan loan)
    {
        // System.out.println("Estado = ADMITTED\n");
        System.out.println("Cambiando estado a PICKED_UP");
        loan.setState(new StatePickedUp());
        // System.out.println("Estado = PICKED_UP\n");
    }

    public void reject(Loan loan)
    {
        System.out.println("Cambiando estado a Rejected");
        loan.setState(new StateRejected());
        // System.out.println("Estado = REJECTED\n");
    }
}
