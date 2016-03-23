//Kyle Albonico
//CSE2 11:10-12
//Creates an X of #s and /s of given length and width

import java.util.Scanner; //import scanner
public class Twisty { //main method
    public static void main(String[] args) {
    
        Scanner myScanner = new Scanner(System.in); //initialize scanner
        int length = 0; //initialize length
        int width = 0; //initialize width
        boolean acceptableLength = false; //determine if a length is acceptable
        boolean acceptableWidth = false; //determine if a width is acceptable
        
        
            while (!acceptableLength) { //while length isn't acceptable
            System.out.print("Input your desired length: "); //input the length
                if (myScanner.hasNextInt()) { //if the value entered is an int
                    length = myScanner.nextInt(); //set length as the value that was entered
                    if (length > 0 && length <= 80) { //bounds for length
                    acceptableLength = true; //make the acceptable boolean true
                    }
                    else { //all other possibilities
                    System.out.println("Must be between 0 and 80");
                    }
                }
                
                else { //all other possibilities
                    System.out.println("ERROR: need an integer"); //must enter int
                    myScanner.next(); //set as next value
                }
            }
            
            while (!acceptableWidth) { //while width isn't acceptable
            System.out.print("Input your desired width: "); //input width
                if (myScanner.hasNextInt()) { //if the value entered is an int
                    width = myScanner.nextInt(); //set width as the value that was entered
                    if (width > 0 && width < length) { //bounds
                    acceptableWidth = true; //make the acceptable boolean true
                    }
                    else {
                    System.out.println("Must be between 0 and the value of length");
                    }
                }
                
                else {
                    System.out.println("ERROR: need an integer"); //must enter int
                    myScanner.next(); //set as next value
                }
            }
        
    
            
            for (int row = 0; row < width; row++) { //row "coordinate"
                for (int column = 0; column < length; column++) { //column "coordinate"
                    
                    int columnMod = column%(2*width); //how to loop the column
                    
                    if (columnMod == row) { //line of #s
                        System.out.print("#"); //print #
                    }
                    
                    else if (columnMod - width == row) { //repeat of /s
                        System.out.print("\\"); //print /
                    }
                    
                    else if (columnMod == width - row - 1) { //line of /s
                        System.out.print("/"); //print /
                    }
                    
                    else if (columnMod - (width - 1) == width - row) { //repeat of #s
                        System.out.print("#"); //print #
                    }
                    
                    else { //space
                        System.out.print(" "); //print space
                    }
                }
            System.out.println(""); //print a new line
            }
                
            
            
    }
}