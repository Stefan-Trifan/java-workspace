public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        GUIFactory factory = new MacFactory();

        Button button = factory.crearButton();
        Checkbox checkbox = factory.crearCheckbox();

        button.render();
        checkbox.render();

        System.out.println("\n_______________________END\n");
    }
}