package patron_template_strategy;

import patron_template_strategy.enums.*;
import patron_template_strategy.strategy.*;
import patron_template_strategy.template.*;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n_______________________START\n");

        // Ordenadores Preconfigurados

        ComputerBuilder myFirstComputer = new IntelComputer(
            new OfficeComputer(),
            IntelProcessor.INTEL_CORE_i3);
        System.out.println(myFirstComputer.buildComputer());

        ComputerBuilder myCodingComputer = new AppleComputer(
            new WorkstationComputer(),
            AppleProcessor.M5);
        System.out.println(myCodingComputer.buildComputer());

        ComputerBuilder myCybersecComputer = new AMDComputer(
            new GamingComputer(),
            AMDProcessor.RYZEN_9);
        System.out.println(myCybersecComputer.buildComputer());

        // Ordenador Custom

        ComputerBuilder myCustomComputer = new AppleComputer(
            new CustomComputer(48, 4096),
            AppleProcessor.M4);
        System.out.println(myCustomComputer.buildComputer());

        System.out.println("\n_______________________END\n");
    }
}