package domain;

import domain.*;
import observer.*;
import state.*;
import strategy.*;

public class LibraryUser
{
    // Como decimos que es un usuario que va a consumir notificaciones
    // _______________________________ Atributos
    private String name;
    private String address;
    private UserTypeEnum userTypeEnum;
    private Boolean activeAccount;

    // ___________________________ Constructores
    // _________________________________ Getters
    // _________________________________ Setters
    // ________________________ Métodos Públicos
    public LibraryUser(String name, String address, UserTypeEnum userTypeEnum, Boolean activeAccount)
    {
        super();
        this.name = name;
        this.address = address;
        this.userTypeEnum = userTypeEnum;
        this.activeAccount = activeAccount;
    }

    // todo | Los usuarios no recibirán acceso a la biblioteca
    // todo | y las notificaciones estarán formadas por texto exclusivamente

    // ________________________ Métodos Privados
}
