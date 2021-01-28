public class PrintTwice {

    public static void printTwice(String s) {
        System.out.println(s);
        System.out.println(s);
    }

    public static void printThrice(String s) {
    	System.out.println(s);
    	System.out.println(s);
    	System.out.println(s);
    	
    }
    
    public static void printTwiceTwice(String s) {
    	printTwice(s);
    	printTwice(s);
    }
    public static void main(String[] args) {
        printTwice("Don't make me say this twice!");

        String message = "Never say never.";
        printTwice(message);
        
        String message2 = "There is no time like today";
        printThrice(message2);
    
        String message3 = "Does that makes sense to you?";
        printTwiceTwice(message3);
    }

    
    
}
