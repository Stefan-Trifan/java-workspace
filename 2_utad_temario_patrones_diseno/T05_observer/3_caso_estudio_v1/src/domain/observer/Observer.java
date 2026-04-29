package domain.observer;

import domain.Loan;

public interface Observer
{
    // ________________________ Métodos Públicos
    public void update(Loan loan);
}
