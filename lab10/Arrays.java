//Kyle Albonico
//CSE2 11:10-12
//Generates random grades for a random number of students

import java.util.Scanner; //import scanner
import java.util.Random; //import random
public class Arrays {
    public static void main(String[] args) { //main method
        Scanner myScanner = new Scanner(System.in); //declare scanner
        Random randomGenerator = new Random(); //declare random
        int numStudents = (randomGenerator.nextInt(5))+5; //generate random ints from 5 to 10
        String[] students = new String [numStudents]; //declare array students
        String name = ""; //declare string name
        
        
        for (int i = 0; i < numStudents; i++) { 
            System.out.print("Enter a name: ");
            name = myScanner.next(); //set name as next input
            students[i] = name; //fill students with names
        }
        
        int[] midterm = new int [numStudents];
        for (int j = 0; j < numStudents; j++) {
            int gradeNumber = randomGenerator.nextInt(100); //generate number b/w 0 and 100
            midterm[j] = gradeNumber; //fill midterm w/ random numbers
            
        }
        
        for (int k = 0; k < numStudents; k++) {
            System.out.print(students[k]+": "); //print names
            System.out.print("\t"); //print tab
            System.out.print(midterm[k]); //print grade
            System.out.println(""); //new line
        }
    }
}