package prog2;
import java.util.Scanner;

class prog2 {
    public static void main (String[] args) {
        int feet;
        int inches;
        int totalHeight;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter height in feet:");
        feet = input.nextInt();

        System.out.println("Enter height in inches:");
        inches = input.nextInt();

        totalHeight = (feet * 12) + inches;
        System.out.println("You are " + totalHeight + " inches tall!");

        System.out.println("Philip Pesic 2/12/23");

        input.close();
    }
}
