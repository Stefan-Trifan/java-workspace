import factory.Factory;
import factory.Button;
import factory.Checkbox;
import factory.MacFactory;
import factory.WindowsFactory;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        Factory miFactory = new MacFactory();

        Button boton = miFactory.fabricarBoton();
        Checkbox checkbox = miFactory.fabricarCheckbox();

        boton.render();
        checkbox.render();

        System.out.println("\n_______________________END\n");
    }
}