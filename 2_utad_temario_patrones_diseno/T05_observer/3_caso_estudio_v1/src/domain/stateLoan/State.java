package domain.stateLoan;

import domain.Loan;

public interface State
{
    // ________________________ Métodos Públicos
    public void cambiar(Loan loan);
    public void reject(Loan loan);
}
