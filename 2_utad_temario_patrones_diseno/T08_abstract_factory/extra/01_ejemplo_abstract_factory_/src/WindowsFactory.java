public class WindowsFactory implements GUIFactory
{
    @Override
    public Button crearButton()
    {
        return new WindowsButton();
    }

    @Override
    public Checkbox crearCheckbox()
    {
        return new WindowsCheckbox();
    }
}