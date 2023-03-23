package Prog4;

class prog4 {
    public static void main(String[] args) {
        cube c1 = new cube();
        cube c2 = new cube();
        cube c3 = new cube();

        c1.setLength(2);
        c1.setWidth(3);
        c1.setHeight(4);

        c2.setLength(3);
        c2.setWidth(4.5);
        c2.setHeight(7);
        
        c3.setLength(4);
        c3.setWidth(9.5);
        c3.setHeight(42);

        System.out.println("C1 volume = " + c1.getVolume());
        System.out.println("C2 volume = " + c2.getVolume());
        System.out.println("C3 volume = " + c3.getVolume());
        System.out.println("Philip Pesic 3/26/23");
    }
}
