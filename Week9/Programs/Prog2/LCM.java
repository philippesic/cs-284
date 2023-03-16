package Prog2;

public class LCM {
    private int n1, n2, lcm;

    public LCM(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public void getLCM() {
        lcm = (n1 > n2) ? n1 : n2;

        while(true) {
            if( lcm % n1 == 0 && lcm % n2 == 0 ) {
                System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
                System.out.println("");
                break;
            }
        ++lcm;

        }
    }
}
