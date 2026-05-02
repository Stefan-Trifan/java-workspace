public class SamsungFactory implements MobileFactory
{
    // ------------------------ Métodos Públicos
    @Override
    public Mobile creatMobile()
    {
        return new SamsungPhone();
    }
}
