import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class InyectionContextAreaStrategy extends ContextAreaStrategy
{
    // _______________________________ Atributos
    private List<GeometricArea> geometricAreaList;

    // ___________________________ Constructores
    public InyectionContextAreaStrategy(
        GeometricArea miGeometricArea,
        List<GeometricArea> geometricAreaList)
    {
        super(miGeometricArea);
        this.geometricAreaList = geometricAreaList;
    }

    // ________________________ Métodos Públicos
    public static double getRandomDoubleBetweenRange(double min, double max)
    {
        return (Math.random() * (max - min)) + min;
    }

    public void sort(Comparator<GeometricArea> comparator)
    {
        geometricAreaList.sort(comparator);
    }

    public void print()
    {
        for (GeometricArea geometricArea : geometricAreaList)
        {
            System.out.println(geometricArea.toString());
        }
    }
}
