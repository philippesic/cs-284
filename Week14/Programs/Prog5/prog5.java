package Prog5;

class prog5 {

    static int result = 0;

    public static int adder(int x) {
        result += x;
        x--;
        if (x > 0) {
            return adder(x);
        } else {
            return result;
        }
    }

    public static void main(String[] args) {
        System.out.println(adder(10));
        System.out.println("Philip Pesic 4/23/23");
    }
}
