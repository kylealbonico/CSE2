//Kyle Albonico
//CSE2 11:10-12
//Prints a text spinner

public class TextSpinner { //main method
    public static void main (String[] args) {
        int k; //declare integer k
        k = 5; //any integer
        
        while (k == 5) { //something that is always true
            System.out.print("/");
            System.out.print('\b'); //backspace
            System.out.print("-");
            System.out.print('\b'); //backspace
            System.out.print("\\"); //use double backslash since slash is special character
            System.out.print('\b'); //backspace
            System.out.print("|");
            System.out.print('\b'); //backspace
        }
    }
}
