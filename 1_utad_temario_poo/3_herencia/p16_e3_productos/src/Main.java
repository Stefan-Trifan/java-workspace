import java.time.LocalDate;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        Ropa misCaterpillar = new Ropa(
            "Cat Intruder",
            55,
            9897,
            43);
        // System.out.println(misCaterpillar.imprimirInfo());
        misCaterpillar.setTalla(67);
        // System.out.println(misCaterpillar.imprimirInfo());

        Producto misNewRock = new Ropa(
            "Botas New Rock",
            180,
            9897,
            44);
        // System.out.println(misNewRock.imprimirInfo());
        ((Ropa) misNewRock).setTalla(82);
        // System.out.println(((Ropa) misNewRock).imprimirInfo());

        Producto miMacbookPro = new Electronica(
            "Macbook Pro M6",
            1850,
            9897,
            3);
        // System.out.println(miMacbookPro.imprimirInfo());

        ArrayList<Producto> miArr = new ArrayList<>();

        miArr.add(misCaterpillar);
        miArr.add(misNewRock);
        miArr.add(miMacbookPro);

        for (Producto p : miArr)
        {
            System.out.println(p.imprimirInfo());
        }

        System.out.println("\n_______________________END\n");
    }
}