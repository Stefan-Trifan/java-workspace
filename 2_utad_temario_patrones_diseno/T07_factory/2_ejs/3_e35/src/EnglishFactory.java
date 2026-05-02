public class EnglishFactory implements MobileFactory
{
    // ------------------------ Métodos Públicos
    @Override
    public Mobile createMobile(TypeMobile typeMobile)
    {
        if(typeMobile == TypeMobile.IPHONE)
        {
            return new Iphone("EN");
        }
        else if(typeMobile == TypeMobile.SAMSUNG)
        {
            return new SamsungPhone("EN");
        }
        else
        {
            throw new IllegalArgumentException("Tipo de móvil no soportado");
        }
    }
}
