public class MobileFactoryManager
{
    // ------------------------------- Atributos
    private static MobileFactoryManager mobileFactoryManager = new MobileFactoryManager(new IphoneFactory());
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
    public Mobile createMobile()
    {
        return mobileFactory.creatMobile();
    }
}
