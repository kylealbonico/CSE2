//Kyle Albonico
//CSE2 11:10-12
//Made a triangle out of ascending and descending numbers

import java.util.Scanner; //import scanner
public class Triangles { //main method
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in); //initialize scanner
        int A = 0;
        boolean acceptable = false;
        
        while (!acceptable) { //while length isn't acceptable
        System.out.print("Enter a number between 5 and 30: ");
                if (myScanner.hasNextInt()) { //if the value entered is an int
                    A = myScanner.nextInt(); //set length as the value that was entered
                    if (A >= 5 && A <= 30)
                    acceptable = true; //make the acceptable boolean true
                    else {
                    System.out.println("Must be between 5 and 30"); //must be in range
                    }
                }
                
                else { //all other possibilities
                    System.out.println("ERROR: need an integer"); //must enter int
                    myScanner.next(); //set as next value
                }
        }
        
        System.out.println("FOR LOOP:"); //for loop
        int i = A; //set int i to hold A
        
        for (int j = 1; j <= i; j++) { //loop j until it reaches i
            for (int k = 1; k <= j; k++) { //loop k until it reaches j
                System.out.print(j); //print j
            }
            System.out.println(); //print a new line
        }
        
        for (int j = i - 1; j >= 1; j = j - 1) { //loop and decrement j until it reaches 1
            for (int k = i - 1; k >= 1; k = k - 1) { //decrement k until it reaches 1
                System.out.print(j); //print j
            }
            i--; //decrement i
            System.out.println(); //print a new line
        }
        
        System.out.println("WHILE LOOP:"); //while loop
        
        int j = 1; //reset j to 1
        int h = A; //store A in h
        
        while (j <= h) { //loop j until it reaches h
            int k = 1; //reset k to 1
            while (k <= j) { //loop k until it reaches j
                System.out.print(j); //print j
                k++; //increment k
            }
            j++; //increment j
            System.out.println(); //print a new line
        }

        j = A - 1; //reset j to A - 1
        int k = A - 1; //reset k to A - 1
        
        while (j >= 1) { //loop until j goes back to 1
            k = h - 1; //set k to h - 1
            while (k >= 1) { //loop until k goes back down to 1
                System.out.print(j); //print j
                k--; //decrement k
            }
            j--; //decrement j
            h--; //decrement h
            System.out.println(); //print a new line
        }
        
        System.out.println("DO-WHILE LOOP:"); //do while loop
        j = 1; //reset j to 1
        int g = A; //store A in g
        
        do { //do while loop
            k = 1; //set k to 1
            do { //do while loop
                System.out.print(j); //print j
                k++; //increment k
            } while (k <= j); //loop until k equals j
            j++; //increment j
            System.out.println(); //print new line
        } while (j <= g); //loop until j equals g
        
        j = A - 1; //reset j to A - 1
        k = A - 1; //reset k to A - 1
        
        do { //do while loop
            k = g - 1; //set k to g - 1
            do { //do while loop
                System.out.print(j); //print j
                k--; //decrement k
            } while (k >= 1); //loop until k goes back to 1
            j--; //decrement j
            g--; //decrement g
            System.out.println(); //print new line
        } while (j >= 1); //loop until j goes back to 1

    }
}