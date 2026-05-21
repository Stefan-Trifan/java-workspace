public class KeyloggerCreator extends MalwareCreator
{
    // ------------------------ Métodos Públicos
    @Override
    public Malware createMalware()
    {
        return new Keylogger();
    }
}
