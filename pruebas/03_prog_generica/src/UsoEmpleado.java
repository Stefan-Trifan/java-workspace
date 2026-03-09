import java.util.*;

public class UsoEmpleado
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        // Array tradicional
        // Empleado listaEmpleados[] = new Empleado[3];
        // listaEmpleados[0] = new Empleado("Ana", 45, 2500);
        // listaEmpleados[1] = new Empleado("Antonio", 55, 2000);
        // listaEmpleados[2] = new Empleado("María", 25, 2600);

        // ArrayList
        ArrayList<Empleado> listaEmpleados2 = new ArrayList<>();

        // listaEmpleados2.ensureCapacity(7); // Capacidad inicial arrayList

        listaEmpleados2.add(new Empleado("Ana", 45, 2500));
        listaEmpleados2.add(new Empleado("Antonio", 55, 2000));
        listaEmpleados2.add(new Empleado("María", 25, 2600));
        listaEmpleados2.add(new Empleado("Ana2", 45, 2500));
        listaEmpleados2.add(new Empleado("Antonio2", 55, 2000));
        listaEmpleados2.add(new Empleado("María2", 25, 2600));

        // listaEmpleados2.trimToSize(); // Recorta espacio sobrante.
        // listaEmpleados2.set(1, new Empleado("Olga", 40, 2600));

        // // Imprimir
        // System.out.println(".size()");
        // System.out.println(listaEmpleados2.size());
        // System.out.println(".get()");
        // System.out.println(listaEmpleados2.get(1).dameDatos());
        // for (Empleado e : listaEmpleados2) // Forma moderna
        // {
        //     System.out.println(e.dameDatos());
        // }
        // for (int i = 0; i < listaEmpleados2.size(); i++) // Forma tradicional
        // {
        //     Empleado e = listaEmpleados2.get(i);

        //     System.out.println(e.dameDatos());
        // }

        // // Iteradores
        // Iterator<Empleado> mIterator = listaEmpleados2.iterator();
        // while (mIterator.hasNext())
        // {
        //     System.out.println(mIterator.next().dameDatos());
        // }

        System.out.println("\n_______________________END\n");
    }
}

class Empleado
{

    public Empleado(String nombre, int edad, double salario)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String dameDatos()
    {
        return "El empleado se llama " + nombre + ". Tiene " + edad + " años." +
            " Y un salario de " + salario;
    }

    private String nombre;

    private int    edad;

    private double salario;
}