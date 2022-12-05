package colloc.template_method;

import colloc.template_method.houses.ModernHouse;
import colloc.template_method.houses.House;
import colloc.template_method.houses.CheapHouse;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Choose a house preset: \n 1 - Cheap house \n 2 - Modern house");
        Scanner scan = new Scanner(System.in);
        int preset;
        do
        {
            preset = Integer.parseInt(scan.nextLine());
            if (preset != 1 && preset != 2) {
                System.out.println("Unsupported input");
            }
        } while (preset != 1 && preset != 2);

        House house = null;
        if (preset == 1){
            house = new CheapHouse();
        } else if (preset == 2){
            house = new ModernHouse();
        }
        house.calculateCost();
    }
}
