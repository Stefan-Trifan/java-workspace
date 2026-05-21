public class App
{
    private Button   button;
    private Checkbox checkbox;

    public App(GUIFactory factory)
    {
        button = factory.crearButton();
        checkbox = factory.crearCheckbox();
    }

    public void render()
    {
        button.render();
        checkbox.render();
    }
}