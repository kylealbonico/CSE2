//Kyle Albonico
//CSE2 11:10-12
//Prints a rectangular configuration depending upon the input

import java.util.Scanner; //input scanner
public class Rectangularize { //create class rectangularize
    public static void main(String[] args) { //main method
        Scanner myScanner = new Scanner(System.in); //initialize scanner
        System.out.println("Please enter an input");
        if (myScanner.hasNextInt()) { //if input is an int
            Rectangularize(myScanner.nextInt()); //run rectangularize
        }
        
        else { //if input is a string
            Rectangularize(myScanner.next()); //run rectangularize
        }
    }
    
    public static void Rectangularize(int rectangularInput) { //method rectangularize
        int counter1 = 0; //initialize counter
        int counter2 = 0; //initialize counter
        while (counter1 < rectangularInput) { //while counter1 approaches input
            counter2 = 0; //reset counter2
            while (counter2 < rectangularInput) { //while counter2 approaches input
                System.out.print("%"); //print symbol
                counter2++; //increment counter2
            }
        counter2 = 1; //reset counter2
        System.out.println(""); //print new line
        counter1++; //increment counter1
        }
    }
    
    public static void Rectangularize(String inputString) { //method rectangularize
        int stringLength = inputString.length(); //set string length as an int
        int counter3 = 1; //initialize counter
            while (counter3 <= stringLength) { //while counter3 appraoches length
                System.out.println(inputString); //print string
                counter3++; //increment counter3
            }
    }
    
}