package Prog3;

class prog3 {
    public static double max(double x, int y) {
        return x;
    }

    public static double max(int x, double y) {
        return y;
    }

    public static void main(String[] args) {
        System.out.println(max(5.0, 1));
        System.out.println(max(5, 1.0));

        System.out.println("Philip Pesic 5/7/23");
    }
}