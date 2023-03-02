package Prog2;
import java.util.Scanner;
import java.lang.Math;

class prog2 {

    public static double area(double x) {
        double area = Math.PI * (x * x);
        return area;
    }

    public static double diameter(double x) {
        double diameter = x * 2;
        return diameter;
    }

    public static double circumference(double x) {
        double circumference = Math.PI * (x * 2);
        return circumference;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Radius: ");
        double radius = input.nextDouble();
        input.close();

        System.out.println("Area: " + area(radius));
        System.out.println("Diameter: " + diameter(radius));
        System.out.println("Circumference: " + circumference(radius));

        System.out.println("Philip Pesic 3/5/23");
    }
}
