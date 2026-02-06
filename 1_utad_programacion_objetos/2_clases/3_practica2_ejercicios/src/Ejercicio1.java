public class Ejercicio1
{
    public static void main(String[] args) 
    {
        System.out.println("\n_______________________START\n");

        if (Lampara.contador < 5)
        {
            Lampara miLampara1 = new Lampara();
            System.out.println(Lampara.contador);
        }
        if (Lampara.contador < 5)
        {
            Lampara miLampara2 = new Lampara();
            System.out.println(Lampara.contador);
        }
        if (Lampara.contador < 5)
        {
            Lampara miLampara3 = new Lampara();
            System.out.println(Lampara.contador);
        }
        if (Lampara.contador < 5)
        {
            Lampara miLampara4 = new Lampara();
            System.out.println(Lampara.contador);
        }
        if (Lampara.contador < 5)
        {
            Lampara miLampara5 = new Lampara();
            System.out.println(Lampara.contador);
        }
        if (Lampara.contador < 5)
        {
            Lampara miLampara6 = new Lampara();
            System.out.println(Lampara.contador);
        }
        if (Lampara.contador < 5)
        {
            Lampara miLampara7 = new Lampara();
            System.out.println(Lampara.contador);
        }

        System.out.println("\n_______________________END\n");
    }

    public static class Lampara
    {
        // _________________________________________
        // Atributos
        public static final Integer MAX_LAMPARAS = 5;
        public static Integer       contador     = 0;

        // _________________________________________
        // Constructor Principal
        public Lampara()
        {
            contador++;
        }

        // _________________________________________
        // Constructores Auxiliares

        // _________________________________________
        // Getters

        // _________________________________________
        // Setters

        // _________________________________________
        // Métodos Públicos

        // _________________________________________
        // Métodos Privados
    }
}