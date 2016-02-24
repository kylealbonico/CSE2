//Kyle Albonico
//CSE2 11:10-12
//Converts 3 integers representing RGB values into hexadecimal
import java.util.Scanner;
public class ToHex { //main method
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in); //declare instance of scanner
        System.out.print("Please enter three numbers representing RGB values: "); //ask user for 3 integers representing RGB values
        
        int number1 = myScanner.nextInt(); //R value
        int number2 = myScanner.nextInt(); //B value
        int number3 = myScanner.nextInt(); //G value
        
        int hexDigit1 = 0; //first part of first hex number
        int hexDigit2 = 0; //second part of first hex number
        int hexDigit3 = 0; //first part of second hex number
        int hexDigit4 = 0; //second part of second hex number
        int hexDigit5 = 0; //first part of third hex number
        int hexDigit6 = 0; //second part of third hex number
        
        String hexRepresentation = "";
        
        if (number1 >= 0 && number1 <= 15) { //RGB is b/w 0 and 15
            hexDigit1 = 0; //placeholder
            hexDigit2 = number1 % 16; //second digit hex
        }
        else if (number1 >= 15 && number1 <= 255) { //RGB is b/w 15-255
            hexDigit1 = number1 / 16; //first digit hexadecimal
            hexDigit2 = number1 % 16; //second digit hexadecimal
        }
        
        char hexRepresentation1 = (char)(hexDigit1 + 48); //character for numbers
        if (hexDigit1 > 9) {
            hexRepresentation1 += 7; //character for letters
        }
        
        char hexRepresentation2 = (char)(hexDigit2 + 48); //character for numbers
        if (hexDigit2 > 9) {
            hexRepresentation2 += 7; //character for letters
        }
        
        if (number2 >= 0 && number2 <= 15) { //RGB is b/w 0 and 255
            hexDigit3 = 0; //placeholder 0
            hexDigit4 = number1 % 16; //second digit hex
        }
        else if (number2 >= 0 && number2 <= 255) { //RGB is b/w 0 and 255
            hexDigit3 = number2 / 16; //first digit hexadecimal
            hexDigit4 = number2 % 16; //second digit hexadecimal
        }
        
        char hexRepresentation3 = (char)(hexDigit3 + 48); //character for numbers
        if (hexDigit3 > 9) {
            hexRepresentation3 += 7; //character for letters
        }
        
        char hexRepresentation4 = (char)(hexDigit4 + 48); //character for numbers
        if (hexDigit4 > 9) {
            hexRepresentation4 += 7; //character for letters
        }
        
        
        if (number3 >= 0 && number3 <= 15) { //RGB is b/w 0 and 255
            hexDigit5 = 0; //placeholder
            hexDigit6 = number3 % 16; //second digit hex
        }
        else if (number3 >= 0 && number3 <= 255) { //RGB is b/w 0 and 255
            hexDigit5 = number3 / 16; //first digit hexadecimal
            hexDigit6 = number3 % 16; //second digit hexadecimal
        }
        
        char hexRepresentation5 = (char)(hexDigit5 + 48); //character for number
        if (hexDigit5 > 9) {
            hexRepresentation5 += 7; //character for letter
        }
        
        char hexRepresentation6 = (char)(hexDigit6 + 48); //character for number
        if (hexDigit6 > 9) {
            hexRepresentation6 += 7; //character for letter
        }
        
        if (number1 >= 0 && number1 <= 255 && number2 >= 0 && number2 <= 255 && number3 >= 0 && number3 <= 255) { //boundaries for RGB values
        System.out.println("The decimal numbers R:"+number1+", G:"+number2+", B:"+number3+"is represented in hexadecimal as: " + hexRepresentation1 + hexRepresentation2 + hexRepresentation3 + hexRepresentation4 + hexRepresentation5 + hexRepresentation6);   
        }
        else if (number1 < 0 || number1 > 255 || number2 < 0 || number2 > 255 || number3 < 0 || number3 > 255) { //outside of hex range
            System.out.println("Sorry, you must enter values between 0-255.");
        }
        else {
            System.out.println("Sorry, your input must consist of integers");
        }
        
    }
}
