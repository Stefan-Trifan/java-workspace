package domain.loan;

public class StateRejected implements StateLoan
{
    // ________________________ Métodos Públicos

    public String devolverState()
    {
        return "Estado = REJECTED";
    }

    public void cambiar(Loan loan)
    {
        System.out.println("Advertencia: Operacion Prohibida");
    }

    public void reject(Loan loan)   
    {
        System.out.println("Advertencia: "
            + "La devolucion ya está rechazada");
    }
}
