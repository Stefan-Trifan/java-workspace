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
        System.out.println("Cambiando estado a ADMITED");
        loan.setState(new StateAdmitted());
    }

    public void reject(Loan loan)
    {
        loan.setState(new StateRejected());
    }
}
