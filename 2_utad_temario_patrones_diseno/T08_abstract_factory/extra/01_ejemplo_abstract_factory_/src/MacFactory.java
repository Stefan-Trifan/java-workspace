public class MacFactory implements GUIFactory
{
    @Override
    public Button crearButton()
    {
        return new MacButton();
    }

    @Override
    public Checkbox crearCheckbox()
    {
        return new MacCheckbox();
    }
}