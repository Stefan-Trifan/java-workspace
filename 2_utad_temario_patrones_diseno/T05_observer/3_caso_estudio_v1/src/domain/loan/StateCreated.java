package domain.loan;

public class StateCreated implements StateLoan
{
    // ________________________ Métodos Públicos
    public String devolverState()
    {
        return "Estado = CREADO\n";
    }

    public void cambiar(Loan loan)
    {
        // System.out.println("Estado = CREADO\n");
        System.out.println("Cambiando estado a ADMITED");
        loan.setState(new StateAdmitted());
        // System.out.println("Estado = ADMITED\n");
    }

    public void reject(Loan loan)
    {
        // System.out.println("Cambiando estado a Rejected");
        loan.setState(new StateRejected());
        // System.out.println("Estado = REJECTED\n");
    }
}
