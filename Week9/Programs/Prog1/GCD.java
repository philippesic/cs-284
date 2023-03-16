package Prog1;

public class GCD {
    int n1, n2, gcd;

    public GCD(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public void findFactors() {
        for(int i = 1; i <= n1 && i <= n2; ++i) {
            if(n1 % i==0 && n2 % i==0) {
                gcd = i;
            }
        System.out.printf("G.C.D. of %d and %d is %d", n1, n2, gcd);
        System.out.println("");
        }
    }
}
