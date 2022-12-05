package colloc.template_method.houses;

import java.util.Scanner;

public abstract class House {
     int cost;
     int floorCost;
     int boilerCost;
     Scanner scan;

     House(){}

    public void calculateCost() {
        cost += floors() * (floorCost + securityLevel()) + boiler() * boilerCost;
        System.out.println("The cost of building the house will be " + cost + "$");
    }
    abstract int floors();
    public int boiler(){
        System.out.print("Will there be a separate boiler (y/n): ");
        String input = scan.nextLine();
        int num = 0;
        if (input.equals("y")) num = 1;
        return num;
    }
    abstract int securityLevel();

}
