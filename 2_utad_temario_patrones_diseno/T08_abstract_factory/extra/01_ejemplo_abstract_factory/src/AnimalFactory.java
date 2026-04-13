// Factory (la parte importante del patrón)

public class AnimalFactory
{
    // ________________________ Métodos Públicos
    public Animal crearAnimal(String tipo)
    {
        if (tipo.equalsIgnoreCase("perro"))
        {
            return new Perro();
        }

        if (tipo.equalsIgnoreCase("gato"))
        {
            return new Gato();
        }

        return null;
    }
}