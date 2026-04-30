package domain.stateLoan;

import domain.Loan;

public interface State
{
    // ------------------------ Métodos Públicos
    public void cambiar(Loan loan);
    public void reject(Loan loan);
}
