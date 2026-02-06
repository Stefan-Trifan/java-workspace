public class Ejercicio4
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");
        Persona persona20 = new Persona("Inés", 20);
        Persona persona25 = new Persona("Paco", 25);
        System.out.println("Entre Inés y Paco, la mayor es " +
            Persona.mayor(persona20, persona25));
        System.out.println("\n_______________________START\n");
    }

    public static class Persona
    {
        // _________________________________________
        // Atributos
        String nombre;
        int    edad;

        // _________________________________________
        // Constructor Principal
        public Persona(String nombre, int edad)
        {
            this.nombre = nombre;
            this.edad = edad;
        }

        // _________________________________________
        // Métodos Públicos
        public static Persona mayor(Persona p1, Persona p2)
        {
            if (p1.edad > p2.edad)
            {
                return p1;
            }
            else
            {
                return p2;
            }
        }

        @Override
        public String toString()
        {
            return "Persona [nombre=" + nombre + ", edad=" + this.edad + "]";
        }
    }
}
