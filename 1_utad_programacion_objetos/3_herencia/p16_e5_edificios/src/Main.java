// Ejercicio 5
// ▪ Definir dos interfaces, y dos clases que implementen las interfaces, para
// representar la situación Siguiente:
// ▪ Una instalación deportiva es un recinto delimitado donde se practican deportes;
// interesa disponer de un método int getTipoDeInstalacion().
// ▪ Un edificio es una construcción cubierta, e interesa disponer de un método double
// getSuperficieEdificio().
// ▪ Un polideportivo es al mismo tiempo una instalación deportiva y un edificio;
// interesa conocer la superficie que tiene y el tipo.
// ▪ Un edificio de oficinas es un edificio; interesa conocer el número de oficinas que
// tiene.
// ▪ En una clase test con el método main, crear un array que contenga tres
// polideportivos y dos edificios de oficinas. Recorrer el array mostrar los
// atributos de cada elemento.

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("\n_______________________START\n");

        ArrayList<Edificio> mList = new ArrayList<>();

        Edificio polideportivoBarcelona = new Polideportivo(20, "A");
        Edificio polideportivoMadrid = new Polideportivo(20, "A");
        Edificio polideportivoValencia = new Polideportivo(20, "A");

        Edificio oficinaIbiza = new EdificioOficinas(10,35);
        Edificio oficinaMalaga = new EdificioOficinas(10,45);

        mList.add(polideportivoBarcelona);
        mList.add(polideportivoMadrid);
        mList.add(polideportivoValencia);
        mList.add(oficinaIbiza);
        mList.add(oficinaMalaga);

        for (Edificio edificio : mList)
        {
            System.out.println(edificio.getSuperficieEdificio());
        }

        System.out.println("\n_______________________END\n");
    }
}