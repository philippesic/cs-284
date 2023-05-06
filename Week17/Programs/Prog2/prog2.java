package Prog2;

class prog2 {
    public static <T> void print(T[] i) {
        for (T x : i) {
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
