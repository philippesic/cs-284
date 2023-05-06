package Prog2;

class prog2 {
    public static int ten(int age) {
        return age + 10;
    }

    public static int ten(int age, String name) {
        System.out.println(name);
        return ten(age);
    }

    public static void main(String[] args) {
        System.out.println(ten(10, "Ben"));

        System.out.println("Philip Pesic 5/7/23");
    }
}