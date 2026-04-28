package strategy;

import domain.*;
import observer.*;
import state.*;
import strategy.*;

public class PushNotificationStrategy
extends LibraryPushNotificationStrategy
implements NotificationStrategy
{
    // _______________________________ Atributos
    // ___________________________ Constructores
    // _________________________________ Getters
    // _________________________________ Setters
    // ________________________ Métodos Públicos
    public void update(Observable obs, Object o)
    {
        // Aquí decides cómo notificar
    }

    // ________________________ Métodos Privados
}
