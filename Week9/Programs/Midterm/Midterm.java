package Midterm;

class Midterm {
    public static void main(String[] args) {

        int iAnswer;
        int i1 = 10;
        int i2 = 20;
        int i3 = 30;

        double dAnswer;
        double d1 = 1.1;
        double d2 = 2.2;
        double d3 = 3.3;

        iAnswer = i2/i1;
        System.out.println("iAnswer = i2/i1: " +iAnswer); //Answer: 2 | 20/10 = 2 | intergers can store int values

        iAnswer = i1/i3; 
        System.out.println("iAnswer = i1/i3: " + iAnswer );  //Answer: 0 | 10/30 = 0.33333 | int cannot store floating point values | Truncated/abbrevieted from the right to 0

        dAnswer = i2/i1;
        System.out.println("dAnswer = i2/i1: " + dAnswer );  //Answer: 2.0 | 20/10 = 2 | 2.0 == 2, but stored as double due to dAnswer datatype

        dAnswer = i1/i2;
        System.out.println("dAnswer = i1/i2: " + dAnswer ); //Answer: 0.0 | 10/20 = 0.5 | dAnswer is double, but compiler cannot compute decimal from int/int | Truncated to 0.0

        dAnswer = d1/d2;
        System.out.println("dAnswer = d1/d2: " + dAnswer ); //Answer: 0.5 | 1.1/2.2 = 0.5 | double can store double values

        // iAnswer = i2/d3;
        // System.out.println("iAnswer = i2/d3: " + dAnswer ); //Cannot compile | int/double cannot be stored as int value since a floating point value is returned | Commented out so program can compile
        
        dAnswer = i1/d3;
        System.out.println("dAnswer = i1/d3: " + dAnswer );  //Answer: 0.0303030303030303 | 10/3.3 = 0.0303030303030303 | int/double can be stored as double, but double datatype only stores 52 bits/16 digits of floating point numbers

        System.out.println("Philip Pesic 3/19/23");
    }
}
