//Kyle Albonico
//CSE2 11:10-12
//Generates a twist of a length that the user inputs

import java.util.Scanner; //import scanner
public class TwistGenerator { //main method
    public static void main(String[]args) {
        
        Scanner myScanner = new Scanner(System.in); //initialize scanner
        int length = 0; //initialize length
        boolean acceptable = false; //determine if length is acceptable
        
        while (!acceptable) { //while not acceptable
            System.out.print("Enter the length of the twist:"); //prompt user for length
            if (myScanner.hasNextInt()) { //check if an int
                length = myScanner.nextInt(); //set length as the int
                if (length > 0) { //length must be greater than 0
                    acceptable = true; //acceptable
                }
                else {
                    System.out.println("Error: Must be greater than 0");
                }
            }
            else {
                System.out.println("Error: Must be an integer");
                myScanner.next(); //set as next value
            }
        }
        
        for (int line1 = 0; line1 < length; line1++) { //loop line1 until it reaches length
            if (line1%3 == 0) { //first part of pattern
                System.out.print("\\");
            }
            if (line1%3 == 1) { //second part of pattern
                System.out.print(" ");
            }
            if (line1%3 == 2) { //third part of pattern
                System.out.print("/");
            }
            
        }
        
        System.out.println(""); //print new line
        
        for (int line2 = 0; line2 < length; line2++) { //loop until line2 reaches length
            if (line2%3 == 0) { //first part of pattern
                System.out.print(" ");
            }
            if (line2%3 == 1) { //second part of pattern
                System.out.print("x");
            }
            if (line2%3 == 2) { //third part of pattern
                System.out.print(" ");
            }
            
        }
        
        System.out.println(""); //print new line
        
        for (int line3 = 0; line3 < length; line3++) { //loop until line3 reaches length
            if (line3%3 == 0) { //first part of pattern
                System.out.print("/");
            }
            if (line3%3 == 1) { //second part of pattern
                System.out.print(" ");
            }
            if (line3%3 == 2) { //third part of pattern
                System.out.print("\\");
            }
            
        }
        
        System.out.println(""); //print new line
          
    }
}