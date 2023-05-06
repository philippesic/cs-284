package Prog1;

class prog1 {
    public static int add(int a, int b) {
        return a + b;
    }

    public static void add(double x, double y) {
        System.out.println(x + y);
    }

    public static void main(String[] args) {
        System.out.println(add(3, 5));
        add(7.5, 1.0);

        System.out.println("Philip Pesic 5/7/23");
    }
}