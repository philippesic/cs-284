package prog2;
import java.util.Scanner;

class prog2 {
    public static void main(String[] args) {
        int grade;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your grade: ");
        grade = input.nextInt();

        if (grade > 100 || grade < 0) {
            System.out.println("Invalid grade!");
        }
        else {
            if (grade >= 90) {
                System.out.println("You have an A!");
            }
            else {
                if (grade >= 80) {
                    System.out.println("You have a B!");
                }
                else {
                    if (grade >= 70) {
                        System.out.println("You have a C!");
                    }
                    else {
                        if (grade >= 60) {
                            System.out.println("You have a D!");
                        }
                        else {
                                System.out.println("You have an F!");
                        }
                    }
                }
            }
        }

        input.close();

        System.out.println("Philip Pesic 2/19/23");
    }
}
