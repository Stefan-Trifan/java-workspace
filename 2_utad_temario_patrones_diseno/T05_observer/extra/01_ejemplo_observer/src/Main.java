public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        Subject subject = new Subject();

        Observer obs1 = new ConcreteObserver("Observer1");
        Observer obs2 = new ConcreteObserver("Observer2");

        subject.addObserver(obs1);
        subject.addObserver(obs2);

        subject.setState(10);
        subject.setState(20);
        subject.setState(30);

        System.out.println("\n_______________________END\n");
    }
}