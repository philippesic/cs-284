class prog6 {
    public static void main(String[] args) {

        System.out.println("hello");
        WholeClass Whole1 = new WholeClass();

        System.out.println("Whole 1 - default constructor - whole X = " + Whole1.getX() );
        System.out.println("Whole 1 - default constructor - Part 1 d = " + Whole1.getPart1D() );
        System.out.println("Whole 1 - default constructor - Part 2 d = " + Whole1.Part2.getD());

        Whole1.setX(20);
        System.out.println( "Whole 1 - set whole X = " + Whole1.getX() );
        Whole1.setPart1D(21);

        System.out.println( "Whole 1 - set Part 1 d = " + Whole1.getPart1D() );
        Whole1.Part2.setD(22);

        System.out.println( "Whole 1 - set Part 2 d = " + Whole1.Part2.getD() );

        WholeClass Whole2 = new WholeClass(91,92,93);

        System.out.println("Whole 2 - Parm constructor - whole X = " + Whole2.getX() );
        System.out.println("Whole 2 - Parm constructor - Part 1 d = " + Whole2.getPart1D() );
        System.out.println("Whole 2 - Parm constructor - Part 2 d = " + Whole2.Part2.getD() );

        Whole2.setX(51);
        System.out.println( "Whole 2 - set whole X = " + Whole2.getX() );
        Whole2.setPart1D( 52);

        System.out.println( "Whole 2 - set Part 1 d = " + Whole2.getPart1D() );
        Whole2.Part2.setD(53);

        System.out.println( "Whole 2 - set Part 2 d = " + Whole2.Part2.getD() );
        System.out.println("Philip Pesic 3/19/23");
        }
}

