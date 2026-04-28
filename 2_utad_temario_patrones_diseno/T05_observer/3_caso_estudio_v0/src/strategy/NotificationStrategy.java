package strategy;

import domain.*;
import observer.*;
import state.*;
import strategy.*;

public interface NotificationStrategy
{
    // ________________________ Métodos Públicos
    public void update(Observable obs, Object o);

    // ________________________ Métodos Privados
}
