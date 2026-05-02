public class RansomwareCreator extends MalwareCreator
{
    // ------------------------ Métodos Públicos
    @Override
    public Malware createMalware()
    {
        return new Ransomware();
    }
}
