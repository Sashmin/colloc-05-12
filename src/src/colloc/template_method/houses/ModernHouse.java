package colloc.template_method.houses;

import java.util.Scanner;

public class ModernHouse extends House{

    public ModernHouse(){
        cost = 0;
        floorCost = 300000;
        boilerCost = 50000;
        scan = new Scanner(System.in);
    }

    @Override
    public int floors() {
        System.out.print("Enter the number of floors (1-3): ");
        String input = scan.nextLine();
        int num = Integer.parseInt(input);
        if (num > 3) num = 3;
        if (num < 1) num = 1;
        return num;
    }

    @Override
    public int securityLevel() {
        int[] levelCosts = new int[]{300, 1000, 3000, 7000, 10000, 20000};

        System.out.print("Enter the level of security (1-6): ");
        String input = scan.nextLine();
        int num = Integer.parseInt(input);
        if (num > 6) num = 6;
        if (num < 1) num = 1;
        return levelCosts[num - 1];
    }
}
