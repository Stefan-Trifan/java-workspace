package factory;

public class WindowsFactory implements Factory
{
    public Button fabricarBoton()
    {
        return new WindowsButton();
    }

    public Checkbox fabricarCheckbox()
    {
        return new WindowsCheckbox();
    }
}
