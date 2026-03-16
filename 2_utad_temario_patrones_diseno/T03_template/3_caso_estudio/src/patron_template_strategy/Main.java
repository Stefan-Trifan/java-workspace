package patron_template_strategy;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        ComputerConfigurationStrategy myStrategy;

        myStrategy = new OfficeComputer();
        ComputerBuilder myIntelComputer = new IntelComputer(
            myStrategy,
            "Intel Core i3");
        myIntelComputer.buildComputer();
        System.out.println();

        myStrategy = new WorkstationComputer();
        ComputerBuilder myAppleComputer = new AppleComputer(
            myStrategy,
            "M5");
        myAppleComputer.buildComputer();
        System.out.println();

        myStrategy = new GamingComputer();
        ComputerBuilder myAMDComputer = new AMDComputer(
            myStrategy,
            "Ryzen 7");
        myAMDComputer.buildComputer();
        System.out.println();

        System.out.println("\n_______________________END\n");
    }
}