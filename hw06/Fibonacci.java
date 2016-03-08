//Kyle Albonico
//CSE2 11:10-12
//Prints Fibonnaci numbers

import java.util.Scanner; //import scanner
public class Fibonacci { //main method
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in); //declare instance of scanner
        System.out.print("Enter 3 positive integer values, the first two being the first two numbers of a Fibonacci sequence and the third being the number of values in the sequence: \n");
        int x,y,z,q; //declare integers
        do {
          x = myScanner.nextInt(); //first integer
          y = myScanner.nextInt();  //second integer
          z = myScanner.nextInt();  //number of values in the sequence
          if (x < 0 || y < 0 || z < 0) {
            System.out.println("Invalid input detected, enter 3 Positive integer values: \n");
          }
        } while (x < 0 || y < 0 || z < 0);
        
        if (z > 0) {
          System.out.print("The numbers are: " + (x) + ", "); //print the first value and a comma
           z --; //decrement z
        }
        
        if(z > 0){ 
          System.out.print(y + ", "); //print the second value and a comma
          z--; //decrement z
        }
        
        while (z > 1){
        System.out.print(x + y + ", "); //print each successive value in the 
        q = x + y; //make 
        x = y; //make x the successive number in the sequence
        y = q; //make y the successive number in the sequence
        z--; //decrement z
        }
        
        if (z == 1) {
        System.out.print(x+y + ".\n"); //print last number in sequence with a period
        }
        
    }
}