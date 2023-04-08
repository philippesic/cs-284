package Prog7;

class prog7 {
    public static void main(String[] args) {
        String[] forwardOrderNames = {"Fred", "Tuyet", "Annie", "Moe", "Ria", "Luke", "Jim", "May", "Rex", "Omar"};
        String[] reverseOrderNames = new String[forwardOrderNames.length];
      
      
        for(int i = forwardOrderNames.length-1, j=0; i >= 0; i--, j++){
            reverseOrderNames[j] = forwardOrderNames[i];
        }
      
        System.out.print("Forward Names: ");
        for (String name : forwardOrderNames) {
            System.out.print(name + " ");
        }
      
        System.out.print("\nReverse Names: ");
        for (String name : reverseOrderNames) {
            System.out.print(name + " ");
        }
        
        System.out.println("\n Philip Pesic 4/9/23");
    }
}
