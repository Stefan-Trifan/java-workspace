public class InstagramLogin
{
    // ------------------------ Métodos Públicos

    public void login(String user)
    {
        MetaLogger.getInstance().log(
            "Usuario " + user + " ha iniciado sesión en Instagram");
    }
}