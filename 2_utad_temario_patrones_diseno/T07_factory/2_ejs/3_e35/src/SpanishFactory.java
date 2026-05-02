public class SpanishFactory implements MobileFactory
{
    // ------------------------ Métodos Públicos
    @Override
    public Mobile createMobile(TypeMobile typeMobile)
    {
        if (typeMobile == TypeMobile.IPHONE)
        {
            return new Iphone("ES");
        }
        else if (typeMobile == TypeMobile.SAMSUNG)
        {
            return new SamsungPhone("ES");
        }
        else
        {
            throw new IllegalArgumentException("Tipo de móvil no soportado");
        }
    }
}
