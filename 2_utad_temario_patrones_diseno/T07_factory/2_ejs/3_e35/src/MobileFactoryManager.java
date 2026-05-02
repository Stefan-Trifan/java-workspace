public class MobileFactoryManager
{
    // ------------------------------- Atributos
    private static MobileFactoryManager mobileFactoryManager
        = new MobileFactoryManager(new EnglishFactory());

    private MobileFactory mobileFactory;
    // --------------------------- Constructores
    private MobileFactoryManager(MobileFactory mobileFactory)
    {
        this.mobileFactory = mobileFactory;
    }
    // --------------------------------- Getters
    public static MobileFactoryManager getInstance()
    {
        return mobileFactoryManager;
    }
    public MobileFactory getMobileFactory()
    {
        return mobileFactory;
    }
    // --------------------------------- Setters
    public void setMobileFactory(MobileFactory mobileFactory)
    {
        this.mobileFactory = mobileFactory;
    }
    // ------------------------ Métodos Públicos
    // todo
    public Mobile createMobile(TypeMobile typeMobile)
    {
        return mobileFactory.createMobile(typeMobile);
    }
}
