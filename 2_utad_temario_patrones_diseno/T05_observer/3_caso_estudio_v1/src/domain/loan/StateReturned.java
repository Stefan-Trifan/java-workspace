package domain.loan;

public class StateReturned implements StateLoan
{
    // ________________________ Métodos Públicos
    public void cambiar(Loan loan)
    {
        System.out.println("Advertencia: "
            + "La devolucion ya está procesada");
    }

    public void reject(Loan loan)
    {
        System.out.println("Advertencia: Operacion Prohibida");
    }
}
