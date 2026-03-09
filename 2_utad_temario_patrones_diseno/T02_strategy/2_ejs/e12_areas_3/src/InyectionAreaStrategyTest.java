import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class InyectionAreaStrategyTest
{
    public static void main(String[] args)
    {
        List<GeometricArea> miLista = new ArrayList<>();
        miLista.add(new Square(InyectionContextAreaStrategy.getRandomDoubleBetweenRange(0, 10)));
        miLista.add(new Circle(InyectionContextAreaStrategy.getRandomDoubleBetweenRange(0, 10)));
        miLista.add(new Square(InyectionContextAreaStrategy.getRandomDoubleBetweenRange(0, 10)));
        miLista.add(new Circle(InyectionContextAreaStrategy.getRandomDoubleBetweenRange(0, 10)));
        miLista.add(new Square(InyectionContextAreaStrategy.getRandomDoubleBetweenRange(0, 10)));
        miLista.add(new Circle(InyectionContextAreaStrategy.getRandomDoubleBetweenRange(0, 10)));
        miLista.add(new Square(InyectionContextAreaStrategy.getRandomDoubleBetweenRange(0, 10)));
        miLista.add(new Circle(InyectionContextAreaStrategy.getRandomDoubleBetweenRange(0, 10)));
        miLista.add(new Square(InyectionContextAreaStrategy.getRandomDoubleBetweenRange(0, 10)));
        miLista.add(new Circle(InyectionContextAreaStrategy.getRandomDoubleBetweenRange(0, 10)));

        System.out.println("Ascendente");
        Comparator<GeometricArea> miComparator = new AscendingAreaComparator();
        InyectionContextAreaStrategy mContext = new InyectionContextAreaStrategy(null, miLista);
        mContext.sort(miComparator);
        mContext.print();

        System.out.println("\n\n\nDescendiente\n\n\n");
        miComparator = new DescendingAreaComparator();
        mContext.sort(miComparator);
        mContext.print();
    }
}
