package factory;
public class WindowsFactory extends Factory
{
    public GUIelement fabricarBoton()
    {
        return new WindowsButton();
    }

    public GUIelement fabricarCheckbox()
    {
        return new WindowsCheckbox();
    }
}
