public class User
{
    // Atributos
    private String username;
    private String password;

    // Constructores

    // Getters

    // Setters
    public void setUsername(String username)
    {
        this.username = username;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    // Métodos públicos
    public boolean checkPassword(String inputPassword)
    {
        return inputPassword.equals(this.password);
    }

    // Métodos privados
}
