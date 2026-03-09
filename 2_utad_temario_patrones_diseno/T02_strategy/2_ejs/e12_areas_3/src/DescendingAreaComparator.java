import java.util.Comparator;

public class DescendingAreaComparator implements Comparator<GeometricArea>
{
    // ________________________ Métodos Públicos
    public int compare(GeometricArea a, GeometricArea b)
    {
        if (a.getArea() > b.getArea())
        {
            return -1;
        }
        else if (a.getArea() < b.getArea())
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    // ________________________ Métodos Privados
}
