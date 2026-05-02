public class TroyanoCreator extends MalwareCreator
{
    // ------------------------------- Atributos
    // --------------------------- Constructores
    // --------------------------------- Getters
    // --------------------------------- Setters
    // ------------------------ Métodos Públicos
    @Override
    public Malware createMalware()
    {
        return new Troyano();
    }
}
