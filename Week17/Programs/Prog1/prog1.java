package Prog1;

class prog1 {
    public static void print(Integer[] i) {
        for (Integer x : i) {
            System.out.printf("%s ", x);
        }
        System.out.println();
    }

    public static void print(Character[] i) {
        for (Character x : i) {
            System.out.printf("%s ", x);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] i = { 1, 2, 3, 4 };
        Character[] c = { 'b', 'u', 'c', 'y' };

        print(i);
        print(c);
        System.out.println("Philip Pesic 5/14/23");
    }
};