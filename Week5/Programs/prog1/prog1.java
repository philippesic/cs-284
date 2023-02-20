package prog1;
import java.util.Scanner;

class prog1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstName;
        int age;

        System.out.println("Enter your name: ");
        firstName = input.nextLine();

        System.out.println("Enter your age: ");
        age = input.nextInt();

        if (age >= 18) {
            System.out.println(firstName + " is an adult");
        }

        else {
            System.out.println(firstName + " is not an adult");
        }

        input.close();
        
        System.out.println("Philip Pesic 2/19/22");
    }
}