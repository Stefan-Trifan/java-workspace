package factory;

public class MacFactory implements Factory
{
    public Button fabricarBoton()
    {
        return new MacButton();
    }

    public Checkbox fabricarCheckbox()
    {
        return new MacCheckbox();
    }
}
