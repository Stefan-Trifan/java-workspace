public class MetodosGenericos
{
    public static void main(String[] args)
    {

        String[] nombres = { "Jose", "Maria", "Pepe" };

        // Empleado[] nombres = { // @off
        //     new Empleado("Ana", 45, 2500),
        //     new Empleado("Ana", 45, 2500),
        //     new Empleado("Ana", 45, 2500),
        //     new Empleado("Ana", 45, 2500)
        // }; // @on

        System.out.println(MisMatrices.getMenor(nombres));
    }
}

class MisMatrices
{
    // _______________________________ Atributos
    // ___________________________ Constructores
    // _________________________________ Getters
    public static <T extends Comparable> T getMenor(T[] a)
    {
        if (a == null || a.length == 0)
        {
            return null;
        }

        T elementoMenor = a[0];

        for (int i = 1; i < a.length; i++)
        {
            if (elementoMenor.compareTo(a[i]) > 0)
            {
                elementoMenor = a[i];
            }
        }

        return elementoMenor;

    }
    // _________________________________ Setters
    // ________________________ Métodos Públicos
    // ________________________ Métodos Privados
}