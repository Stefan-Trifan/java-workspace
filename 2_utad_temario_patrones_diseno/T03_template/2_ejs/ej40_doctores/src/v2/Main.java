package v2;
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        Strategy myStrategy = new DrWang();
        Context myContext = new Context(myStrategy);
        myContext.atender();

        System.out.println();

        myStrategy = new DrFong();
        myContext.setStrategy(myStrategy);
        myContext.atender();

        System.out.println("\n_______________________END\n");
    }
}