package domain;

import domain.loan.StateLoan;

public interface Observer
{
    // ________________________ Métodos Públicos
    public void update(StateLoan stateLoan);
}
