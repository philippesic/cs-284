package prog4;
import java.util.Scanner;

class prog4 {

    public static void main(String[] args) {
    char hasMoney, hasTime, isHungry, restaurantOpen, hasTransportation;
    Scanner input = new Scanner(System.in);

    System.out.println("Do you have money? (Y/N)");
    hasMoney = input.next().charAt(0);

    System.out.println("Do you have Time? (Y/N)");
    hasTime = input.next().charAt(0);

    System.out.println("Are you hungry? (Y/N)");
    isHungry = input.next().charAt(0);

    System.out.println("Is the restaurant open? (Y/N)");
    restaurantOpen = input.next().charAt(0);

    System.out.println("Do you have transportation? (Y/N)");
    hasTransportation = input.next().charAt(0);

    if (hasMoney == 'Y') {
        if (hasTime == 'Y') {
            if (isHungry == 'Y') {
                if (restaurantOpen == 'Y') {
                    if (hasTransportation == 'Y') {
                        System.out.println("You can go get lunch!");
                    }
                    else {
                        System.out.println("You don't have transportation!");
                    }
                }
                else {
                    System.out.println("The restaurant isn't open!");
                }
            }
            else {
                System.out.println("You're not hungry!");
            }
        }
        else {
            System.out.println("You don't have time!");
        }
    }
    else {
        System.out.println("You don't have money!");
    }

    input.close();
    System.out.println("Philip Pesic 2/19/23");
    }
}
