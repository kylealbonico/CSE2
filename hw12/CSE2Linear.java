//Kyle Albonico
//CSE2 11:10-12
//Generates an array of grades and searches and scrambles this array

import java.util.Scanner; //import scanner
public class CSE2Linear {
    public static void main(String[] args) { //main method
        int[] grades = new int [15]; //declare grades array
        int finalGrade = 0; //declare finalGrade
        
        Scanner myScanner = new Scanner(System.in); //declare scanner
        int i = 0; //declare counter
        while (i < 15) { //run until i equals 15
            
            System.out.print("Input an integer for a final grade in CSE2: ");
                
            if (myScanner.hasNextInt()) { //if input is an int
                    finalGrade = myScanner.nextInt(); //set final grade as next int
                if (i == 0) { //first condition
                    if (finalGrade >= 0 && finalGrade <= 100) { //range
                        grades[i] = finalGrade; //number is final grade
                        i++; //increment i
                    }
                    else { //not in range
                        System.out.println("Error: Not in range, must be between 0 and 100: ");
                    }
                }
            
            
                else if (i > 0) { //next conditions
                    if (finalGrade >= 0 && finalGrade <= 100 && finalGrade >= grades[i-1]) { //in range and larger than previous
                        grades[i] = finalGrade; //number is final grade
                        i++; //increment i
                    }
                    else if (finalGrade < 0 || finalGrade > 100) { //not in range
                        System.out.println("Error: Not in range, must be between 0 and 100: ");
                    }
                    else if (finalGrade < grades[i-1]) { //less than the previous entry
                        System.out.println("Error: must be greater than the previous entry: ");
                    }
                }
                    
            }
                
            else { //not an int
                System.out.println("Error: not an integer: ");
                myScanner.next(); //returns to top
            }
            
        }
        
        System.out.println("Sorted: ");
        for (int j = 0; j < 15; j++) { //print array
            System.out.println(grades[j]);
            
        }
    
    boolean acceptable = false; //initialize acceptable
    int selection = 0; //initialize selection
        
    while (acceptable==false) {//while not acceptable
            System.out.print("Enter a grade to be searched for: ");
            if (myScanner.hasNextInt()) { //if input is an int
                selection = myScanner.nextInt(); //selection is next input
                acceptable = true; //acceptable
            }
            else { //not int
                System.out.println("Error: not an int: ");
                myScanner.next(); //return
            }
    }
        
    binarySearch(selection, grades); //run search binary method
    
    scramble(grades); //run scramble method
    
    for (int p = 0; p < 15; p++) { //print scramble
            System.out.println("Scrambled: "+grades[p]);
            
        }
    
    boolean acceptable2 = false; //initialize acceptable2
    while (acceptable2==false) {//while not acceptable
            System.out.print("Enter a grade to be searched for: ");
            if (myScanner.hasNextInt()) { //if an int
                selection = myScanner.nextInt(); //selection is next int
                acceptable2 = true; //acceptable
            }
            else { //not int
                System.out.println("Error: not an int: ");
                myScanner.next(); //return
            }
    }
    
    linearSearch(selection, grades); //run search linear method
    
}

    public static void binarySearch(int x, int[] y){ //binary search method
        int low = 0; //lowest value
        int high = y.length-1; //highest value
        int counter = 0; //counter
        boolean check = true; //continues loop
        while (check) {
            int mid = (low+high)/2; //middle of list
            counter++; //increment counter
            if (high == low) { //if search completed
                System.out.println(x+" was not found in the list.");
                check = false; //exit loop
            }
            else if (x == y[mid]) { //if found
                System.out.println(x+" was found in the list with "+counter+" iterations.");
                check = false; //exit loop
            }
            else if (x > y[mid]) { //if above middle
                low = mid + 1; //set new low
            }
            else if (x < y[mid]) { //if below middle
                high = mid - 1; //set new high
            }
            
        }
    }
    
    public static void linearSearch(int x, int[] y) { //linear search method
       int k = 0; //intialize k
        boolean foundIt = false; //not found
        while (foundIt == false) { //not found
            for (k = 0; k < y.length; k++) { 
                if (y[k] == x) { //if the value equals a value in the array
                    System.out.println(x+" was found in the list with "+(k+1)+" iterations.");
                    foundIt = true; //exit loop
                }
                else if (k == y.length-1 && y[k] != x && foundIt == false) { //if not and done searching
                    System.out.println(x+" was not found in the list.");
                    foundIt = true; //exit loop1
                }
            }
        }
    }
    
    public static int[] scramble(int[] z) { //scramble methid
        for (int q = 0; q < 15; q++) { //from 0 to 15
            int target = (int) (Math.random()*14); //generate random int from 0 to 14
            int temp = z[q]; //temporarily store
            z[q] = z[target]; //set value as random place in array
            z[target] = temp; //set random place in array as temp
        }
        return z;
    }
}    