package Prog1;
import java.util.Scanner;

class prog1 {

    public static double area(double x) {
        double area = x * x;
        return area;
    }
    
    public static double perimeter(double x) {
        double perimeter = x * 4;
        return perimeter;
    }
    
    public static void main(String[] args) {
        double length;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = input.nextDouble();

        input.close();

        System.out.println("Area: " + area(length));
        System.out.println("Perimeter: " + perimeter(length));
        System.out.println("Philip Pesic 3/5/23");
    }

}