package Prog5;
import java.util.Scanner;
import Prog1.GCD;
import Prog2.LCM;
import Prog3.Factorial;
import Prog4.Digits;

public class Menu {

    private Scanner input = new Scanner(System.in);
    
    private int option;
    private GCD gcd;
    private LCM lcm;
    private Factorial factorial;
    private Digits digits;

    private int x;
    private int y;

    public Menu() {
        System.out.println("Select an option: \n Find GCF (1) \n Find LCM (2) \n Find Factorial (3) \n Find number of Digits (4)");
        option = input.nextInt();
    }

    public void Option() {    
        switch(option) {
            case 1:
                System.out.println("Enter input values: ");
                x = input.nextInt();
                y = input.nextInt();
                gcd = new GCD(x, y);
                gcd.findFactors();
                break;

            case 2:
                System.out.println("Enter input values: ");
                x = input.nextInt();
                y = input.nextInt();
                lcm = new LCM(x, y);
                lcm.getLCM();
                break;
            
            case 3:
                System.out.println("Enter input value: ");
                x = input.nextInt();
                factorial = new Factorial(x);
                factorial.getFactorial();
                break;

            case 4:
                System.out.println("Enter input value: ");
                x = input.nextInt();
                digits = new Digits(x);
                digits.getDigits();
                break;
            
            default:
                System.out.println("Invalid Input");
                System.exit(0);
        }
    }
}
