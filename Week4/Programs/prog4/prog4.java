package prog4;
import java.util.Scanner;

public class prog4 {
    public static void main(String[] args) {
        String first;
        String last;
        String temp;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first name: ");
        first = input.nextLine();

        System.out.println("Enter last name: ");
        last = input.nextLine();
        
        System.out.println("Full Name: " + first + " " + last);

        temp = first;
        first = last;
        last = temp;
        System.out.println("Reverse Name: " + first + " " + last);

        System.out.println("Philip Pesic 2/12/23");

        input.close();
    }
}
