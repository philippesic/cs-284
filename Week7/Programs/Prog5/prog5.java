package Prog5;

class prog5 {

    public static int sqInt(int x) {
        return x * x;
    }

    public static float sqFloat(float x) {
        return x * x;
    }

    public static double sqDouble(double x) {
        return x * x;
    }
    public static void main(String[] args) {
        System.out.println("Int: " + sqInt(2));
        System.out.println("Float: " + sqFloat(2.1f));
        System.out.println("Double: " + sqDouble(2.3321));

        System.out.println("Philip Pesic 3/5/23");
    }
}
