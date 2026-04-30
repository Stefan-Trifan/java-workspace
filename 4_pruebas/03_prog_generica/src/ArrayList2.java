import java.io.*;

public class ArrayList2
{
    // ------------------------------- Atributos
    private Object[] datosElemento;
    private int      i = 0;

    // --------------------------- Constructores
    public ArrayList2(int z)
    {
        datosElemento = new Object[z];
    }

    // ------------------------ Métodos Públicos
    public Object get(int i)
    {
        return datosElemento[i];
    }

    public void add(Object o)
    {
        datosElemento[i] = o;
        i++;
    }

    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        ArrayList2 archivos = new ArrayList2(6);

        archivos.add("Juan");
        archivos.add("Maria");
        archivos.add("Ana");
        archivos.add("Sandra");

        archivos.add(new File("prueba.txt"));

        // String nombrePersona = (String) archivos.get(4);

        System.out.println("\n_______________________END\n");
    }
}