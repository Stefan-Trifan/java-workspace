import factory.Factory;
import factory.GUIelement;
import factory.MacFactory;
import factory.WindowsFactory;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        Factory miFactory = new WindowsFactory();

        GUIelement boton = miFactory.fabricarBoton();
        GUIelement checkbox = miFactory.fabricarCheckbox();

        boton.render();
        checkbox.render();

        System.out.println("\n_______________________END\n");
    }
}