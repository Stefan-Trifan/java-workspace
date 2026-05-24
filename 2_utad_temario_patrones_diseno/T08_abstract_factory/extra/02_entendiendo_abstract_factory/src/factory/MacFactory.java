package factory;
public class MacFactory extends Factory
{
    public GUIelement fabricarBoton()
    {
        return new MacButton();
    }

    public GUIelement fabricarCheckbox()
    {
        return new MacCheckbox();
    }
}
