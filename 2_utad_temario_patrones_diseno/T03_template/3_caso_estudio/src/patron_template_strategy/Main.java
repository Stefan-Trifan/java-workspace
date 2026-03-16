package patron_template_strategy;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        ComputerConfigurationStrategy myStrategy;

        myStrategy = new OfficeComputer();
        ComputerBuilder myFirstComputer = new IntelComputer(
            myStrategy,
            "Intel Core i3");
        System.out.println(myFirstComputer.buildComputer());

        myStrategy = new WorkstationComputer();
        ComputerBuilder myStudyComputer = new AppleComputer(
            myStrategy,
            "M5");
        myStudyComputer.buildComputer();
        System.out.println(myStudyComputer.buildComputer());

        myStrategy = new GamingComputer();
        ComputerBuilder myGamingComputer = new AMDComputer(
            myStrategy,
            "Ryzen 7");
        myGamingComputer.buildComputer();
        System.out.println(myGamingComputer.buildComputer());

        System.out.println("\n_______________________END\n");
    }
}