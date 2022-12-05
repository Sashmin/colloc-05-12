package colloc.template_method.houses;

import java.util.Scanner;

public class CheapHouse extends House{

    public CheapHouse(){
        cost = 0;
        floorCost = 150000;
        boilerCost = 20000;
        scan = new Scanner(System.in);
    }

    @Override
    public int floors() {
        return 1;
    }

    @Override
    public int securityLevel() {
        int[] levelCosts = new int[]{300, 1000, 3000};

        System.out.print("Enter the level of security (1-3): ");
        String input = scan.nextLine();
        int num = Integer.parseInt(input);
        if (num > 3) num = 3;
        if (num < 1) num = 1;
        return levelCosts[num - 1];
    }
}
