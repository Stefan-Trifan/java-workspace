package observer;

import domain.*;
import observer.*;
import state.*;
import strategy.*;

public interface Observer
{
    // ________________________ Métodos Públicos
    public void update(Observable obs, Object o);

    // ________________________ Métodos Privados
}
