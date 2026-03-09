// Patrón Strategy: estrategia de obtención de datos
interface DataRetrievalStrategy
{
    String getData();
}

class DatabaseStrategy implements DataRetrievalStrategy
{
    public String getData()
    {
        return "Datos desde la base de datos";
    }
}

class APIStrategy implements DataRetrievalStrategy
{
    public String getData()
    {
        return "Datos desde la API";
    }
}