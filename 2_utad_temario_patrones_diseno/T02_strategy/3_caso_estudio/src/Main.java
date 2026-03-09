public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        Strategy Wang = new DrWang();
        Strategy Fong = new DrFong();

        Context mContext = new Context(Wang);
        mContext.examinar();
        mContext.enviarFactura();
        mContext.enviarResultado();
        mContext.setmStrategy(Fong);
        mContext.examinar();
        mContext.enviarFactura();
        mContext.enviarResultado();

        System.out.println("\n_______________________END\n");
    }
}