//Kyle Albonico
//CSE2 11:10-12
//Creates a game with 3 minigames

import java.util.Scanner;
public class Games {
    public static void main(String[] args) { //main method
    
        Scanner myScanner = new Scanner(System.in); //initialize scanner
        System.out.println("Welcome to Kyle's game center");
        System.out.println("Pick a game (guessTheBox, spinTheWheel, or scrambler): ");
        String gameSelection = myScanner.next(); //game selection
        
        if (gameSelection.equals("guessTheBox")) { //pick guess the box
        int guess = 0; //initialize guess
        boolean acceptableGuess = false;
        while (!acceptableGuess) { //while input isn't acceptable
            System.out.print("Guess the Box: Choose 1, 2 or 3. Inside one of the boxes is a prize: "); //input the length
                if (myScanner.hasNextInt()) { //if the value entered is an int
                    guess = myScanner.nextInt(); //set guess as the value that was entered
                    if (guess >=1 && guess <= 3) { //bounds for guess
                    acceptableGuess = true; //make the acceptable boolean true
                    }
                    else { //all other possibilities
                    System.out.println("Must be 1, 2, or 3");
                    }
                }
                
                else { //all other possibilities
                    System.out.println("ERROR: must enter 1, 2 or 3"); //must enter int
                    myScanner.next(); //set as next value
                }
        }
            guessTheBox(guess); //run guess the box
        }
        
        else if (gameSelection.equals("spinTheWheel")) { //pick spin the wheel
            
            boolean acceptableSpinNumber = false; //acceptable input
            boolean acceptableSpinColor = false; //acceptable input
            int spinNumber = 0; //initialize spin num
            String spinColorString = ""; //initialize color
            int spinColor = 0; //initialize 
            
            while (!acceptableSpinNumber) { //while input isn't acceptable
                System.out.print("Spin the Wheel: choose a number from 1 to 5: "); //input the number
                    if (myScanner.hasNextInt()) { //if the value entered is an int
                        spinNumber = myScanner.nextInt(); //set guess as the value that was entered
                        if (spinNumber >= 1 && spinNumber <= 5) { //bounds for guess
                        acceptableSpinNumber = true; //make the acceptable boolean true
                        }
                        else { //all other possibilities
                        System.out.println("ERROR: Must be an integer from 1 to 5");
                        }
                    }
                    
                    else { //all other possibilities
                        System.out.println("ERROR: must enter an integer from 1 to 5"); //must enter int
                        myScanner.next(); //set as next value
                    }
            }
            
            while (!acceptableSpinColor) { //while input isn't acceptable
                System.out.print("Choose a color (Red or Black): "); //input the length
                    if (myScanner.hasNext()) { //if the value entered is an int
                        spinColorString = myScanner.next(); //set spinColorString as the value that was entered
                        
                        if (spinColorString.equals("black") || spinColorString.equals("red") || spinColorString.equals("Black") || spinColorString.equals("Red")) { //bounds for spin
                        acceptableSpinColor = true; //make the acceptable boolean true
                        }
                        else { //all other possibilities
                        System.out.println("ERROR: Must be Red or Black");
                        }
                    }
                    
                    else { //all other possibilities
                        System.out.println("ERROR: must be Red or Black"); //must enter red or black
                        myScanner.next(); //set as next value
                    }
            }
                spinTheWheel(spinNumber, spinColorString); //run spin the wheel
        }
            
            else if (gameSelection.equals("scrambler")) { //pick scrambler
                System.out.println("Enter a string");
                scrambler(myScanner.next()); //run scrambler
            }
            
            else {
                System.out.println("Error: Game not found.");
            }
        
        }   
    
    
    public static void guessTheBox(int guess) { //method guess the box
 
        int box = (int) (Math.random()*3); //random int 1-3
        
        if (box == guess) {  //correct guess
            System.out.println("Congratulations! You selected the correct box and won 10 coins!");
        }
        
        else {
            System.out.println("Sorry, you did not choose the correct box.");
        }
    }
    
    public static void spinTheWheel(int spinNumber, String spinColorString) { //method spin the wheel
        int spinColor = 0; //initialize spinColor
        int spinColorActual = 0; //initialize actual spin color
        int spinNumberActual = 0; //initialize actual spin number
        if (spinColorString.equals("black") || spinColorString.equals("Black")) { //account for caps
            spinColor = 1; //spinColor for black
        }
        
        else { //all other possibilities
            spinColor = 2; //set spinColor for red
        }
        
        spinColorActual = (int) (Math.random()*2); //random number 1-2
        spinNumberActual = (int) (Math.random()*5); //random number 1-5
        
        if (spinColorActual == spinColor && spinNumberActual == spinNumber) { //correct guess
            System.out.println("Congratulations! You chose the correct color and number!");
        }
        
        else { //incorrect guess
            System.out.println("Sorry, you did not choose the correct color and number.");
        }
    
    }
    
    public static void scrambler(String str) { //scrmabler method
        char [] array = str.toCharArray(); //set string to an array of characters
        for (int i = 0; i < str.length(); i++) { //as integer approaches string length
            int random = (int) (Math.random()*(str.length() - i)); //random placement of int
            System.out.print(array[random]); //print random array
            for (int j = random; j < str.length() - i - 1; j++) { //as j approaches string length
                array[j] = array[j + 1]; //shift j over 1 spot
            }
        }
        
}

}