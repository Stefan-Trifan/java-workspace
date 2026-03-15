public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        ComputerBuilder myIntelComputer = new IntelComputer("Intel Core i3", 8, 16);
        myIntelComputer.buildComputer();
        System.out.println();

        ComputerBuilder myAppleComputer = new AppleComputer("M5", 16, 256);
        myAppleComputer.buildComputer();
        System.out.println();

        ComputerBuilder myAMDComputer = new AMDComputer("Ryzen 7", 32, 2048);
        myAMDComputer.buildComputer();
        System.out.println();

        System.out.println("\n_______________________END\n");
    }
}