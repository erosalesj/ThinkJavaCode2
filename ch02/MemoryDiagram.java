public class MemoryDiagram {

    public static void main(String[] args) {
        int a = 5;
        int b = a;     // a and b are now equal
        a = 3;         // a and b are no longer equal
        int c = 0;
        //print the updated values of the variables a, b and c
        System.out.println("The value of a is: " + a + "\nThe value of b is: " + b + "\nThe value of c is: " + c);
    }

}
