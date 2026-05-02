public class KeyloggerCreator extends MalwareCreator
{
    // ------------------------------- Atributos
    // --------------------------- Constructores
    // --------------------------------- Getters
    // --------------------------------- Setters
    // ------------------------ Métodos Públicos
    @Override
    public Malware createMalware()
    {
        return new Keylogger();
    }
}
