package domain.observer;

import domain.Loan;

public interface Observer
{
    // ------------------------ Métodos Públicos
    public void update(Loan loan);
}
