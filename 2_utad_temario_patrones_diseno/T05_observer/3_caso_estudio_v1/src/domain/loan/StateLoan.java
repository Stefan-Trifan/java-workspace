package domain.loan;

public interface StateLoan
{
    // ________________________ Métodos Públicos
    public void cambiar(Loan loan);
    public void reject(Loan loan);
    public String devolverState();
}
