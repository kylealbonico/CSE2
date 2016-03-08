//Kyle Albonico
//CSE2 11:10-12
//Generates a twist of a length that the user inputs

import java.util.Scanner; //import scanner
public class TwistGenerator { //main method
    public static void main(String[]args) {
        
        Scanner myScanner = new Scanner(System.in); //initialize scanner
        System.out.print("Enter the length of the twist:"); //prompt user for length
        
        int length = myScanner.nextInt(); //initialize length
        int counter1 = 0; //initialize counter 1
        int counter2 = 0; //initialize counter 2
        int counter3 = 0; //initialize counter 3
        
        String line1 = "\\ /";
        String line2 = " x ";
        String line3 = "/ \\";
        
            while (counter1 < length) {
                System.out.print(line1);
                counter1 = counter1++;
                
                    if (counter1 == length) {
                        System.out.print(line1+"\n");
                        break;
                }
            }
            
            while (counter2 < length) {
                System.out.print(line2);
                counter2 = counter2++;
                
                    if (counter2 == length) {
                        System.out.print(line2+"\n");
                        break;
                    }
            }
            
            
            while (counter3 < length) {
                System.out.print(line3);
                counter3 = counter3++;
                
                    if (counter3 == length) {
                        System.out.print(line3);
                        break;
                    }
            }
            
    }
}