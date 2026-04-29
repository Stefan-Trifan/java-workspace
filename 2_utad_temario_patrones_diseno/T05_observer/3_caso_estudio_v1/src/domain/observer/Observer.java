package domain.observer;

import domain.loan.*;

public interface Observer
{
    // ________________________ Métodos Públicos
    public void update(Loan loan);
}
