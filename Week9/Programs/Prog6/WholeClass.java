public class WholeClass {

    public int x;
    public PartClass Part1 = new PartClass();

    public void setPart1D(double inD) {
        Part1.setD(inD);
    }

    public double getPart1D() {
        return Part1.getD();
    }

    public int getX() {
        return x;
    }

    public void setX(int inX) {
        x = inX;
    }

    PartClass Part2 = new PartClass();

    public WholeClass() {
        x = 0;
    }

    public WholeClass(int inX, double inD1, double inD2) {
        x = inX; Part1.setD(inD1);
        Part2.setD(inD2);
    }
}