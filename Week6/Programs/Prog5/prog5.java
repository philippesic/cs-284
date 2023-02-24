package Prog5;
import java.util.Formatter;

class prog5 {
    public static void main(String[] args) {

        Formatter f = new Formatter();

        for (int mult = 1; mult <= 12; mult++) {
            for (int count = 1; count <= 12; count++) {
                System.out.print(f.format("%5d", mult * count));
                f = new Formatter();
            }
            System.out.println();
        }
        f.close();
        System.out.println("Philip Pesic 2/26/23");
    }
}
