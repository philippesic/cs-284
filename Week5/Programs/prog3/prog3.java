package prog3;
import java.util.Scanner;

class prog3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char tempType;
        int temp;
        int tempOut;

        System.out.println("Enter the type of temperature (C/F): ");
        tempType = input.next().charAt(0);;

        System.out.println("Enter temperature: ");
        temp = input.nextInt();

        if (tempType == 'C') {
            tempOut = (temp * 9/5) + 32;
            System.out.println("Result: " + tempOut + "˚F");
        }
        else {
            if (tempType == 'F') {
                tempOut = (temp - 32) * 5/9;
                System.out.println("Result: " + tempOut + "˚C");
            }
            else {
                System.out.println("Invalid temperature type!");
            }
        }

        input.close();
        System.out.println("Philip Pesic 2/19/23");
    }
}
