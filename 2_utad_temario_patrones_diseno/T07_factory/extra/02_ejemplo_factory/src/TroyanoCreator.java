public class TroyanoCreator extends MalwareCreator
{
    // ------------------------ Métodos Públicos
    @Override
    public Malware createMalware()
    {
        return new Troyano();
    }
}
