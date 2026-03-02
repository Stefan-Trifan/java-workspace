import java.util.*;

public class PersonaManager
{
    private List<Persona> personas = new ArrayList<>();

    public void add(Persona p)
    {
        personas.add(p);
    }

    public void ordenar(Comparator<Persona> comparator)
    {
        personas.sort(comparator);
    }

    public void print()
    {
        for (Persona p : personas)
        {
            System.out.println(p);
        }
    }
}