package domain;

import domain.stateLoan.*;

public interface Observer
{
    // ________________________ Métodos Públicos
    public void update(Loan loan);
}
