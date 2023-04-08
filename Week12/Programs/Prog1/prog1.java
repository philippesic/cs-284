package Prog1;
import java.util.Scanner;

class prog1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();
        e = input.nextInt();
        f = input.nextInt();
        g = input.nextInt();
        h = input.nextInt();
        i = input.nextInt();
        j = input.nextInt();
        k = input.nextInt();
        l = input.nextInt();
        m = input.nextInt();
        n = input.nextInt();
        o = input.nextInt();
        p = input.nextInt();
        q = input.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
        System.out.println(n);
        System.out.println(o);
        System.out.println(p);
        System.out.println(q);
        System.out.println(" ");

        int arr[] = new int[17];

        for (int x = 0; x < 17; x++) {
            arr[x] = input.nextInt();
        }
        for (int x = 0; x < 17; x++) {
            System.out.println(arr[x]);
        }
        input.close();
        System.out.println("Philip Pesic 4/9/23");
    }
}