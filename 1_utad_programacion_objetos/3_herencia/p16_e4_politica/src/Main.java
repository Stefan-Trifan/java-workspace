// Ejercicio 4
// ▪ Declara una clase abstracta Legislador con un atributo
// provinciaQueRepresenta (tipo String) y otros atributos.
// ▪ Declara un método abstracto getCamaraEnQueTrabaja.
// ▪ Crea dos clases concretas que hereden de Legislador: la clase Diputado
// y la clase Senador que sobreescriban los métodos abstractos
// necesarios.
// ▪ Crea una lista de legisladores y muestra por pantalla la cámara en la
// que trabajan haciendo uso del polimorfismo.

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("\n_______________________START\n");

        Legislador l1 = new Senador(
            "Andalucia", 
            "Pepito", 
            10);

        Legislador l2 = new Diputado(
            "Madrid", 
            "Avalos", 
            89);

        List<Legislador> miArray = new ArrayList<>();
        miArray.add(l1);
        miArray.add(l2);

        for (Legislador legislador : miArray) {
            System.out.println(legislador.getCamaraEnQueTrabaja());
        }

        System.out.println("\n_______________________END\n");
    }
}