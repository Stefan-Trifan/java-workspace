import java.util.Comparator;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        PersonaManager manager = new PersonaManager();

        manager.add(new Persona("Ana", 30));
        manager.add(new Persona("Luis", 20));
        manager.add(new Persona("Carlos", 40));

        manager.ordenar(new Comparator<Persona>() {
            public int compare(Persona p1, Persona p2)
            {
                return p1.getEdad() - p2.getEdad();
            }
        });

        manager.print();

        System.out.println("\n_______________________END\n");
    }
}