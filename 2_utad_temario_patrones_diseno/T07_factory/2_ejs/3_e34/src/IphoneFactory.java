public class IphoneFactory implements MobileFactory
{
    // ------------------------ Métodos Públicos
    @Override
    public Mobile creatMobile()
    {
        return new Iphone();
    }
}
