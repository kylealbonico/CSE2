//Kyle Albonico
//CSE2 11:10-12
//

import java.util.Scanner; //import scanner
public class Holoporter { //class
    public static void main(String[] args) { //main method
        String[][][] arr1 = soRandom(); //declare first array
        
        for (int i = 0; i < arr1.length; i++) { //loop dim 3
            for (int j = 0; j < arr1[i].length; j++) { //loop dim 2
                for (int k = 0; k < arr1[i][j].length; k++) { //loop dim 1
                    arr1[i][j][k] = coder(); //assign code
                }
            }
        }
        
        print(arr1); //print
        
        String[][][] arr2 = soRandom(); //create random array
        
        holoport(arr2, arr1); //holoport arrays
        System.out.println(""); //print new line
        print(arr2); //print array 2
        
        System.out.println(""); //print new line
        
        Scanner myScanner = new Scanner(System.in); //declare scanner
        boolean check = false; //check
        String selection = ""; //declare string
        while (!check) { //not check
            System.out.println("Enter a code: ");
            selection = myScanner.next(); //next string
            int letter1 = (int) (selection.charAt(0)); //find chars
            int letter2 = (int) (selection.charAt(1));
            int number1 = (int) (selection.charAt(2));
            int number2 = (int) (selection.charAt(3));
            int number3 = (int) (selection.charAt(4));
            int number4 = (int) (selection.charAt(5));
            if (letter1 > 64 && letter1 < 96 && letter2 > 64 && letter2 < 96 && number1 > 47 && number1 < 58 && number2 > 47 && number2 < 58 && number3 > 47 && number3 < 58 && number4 > 47 && number4 < 58) {
                sampling(selection, arr1); // if correct type
                check = true; //set check to true
            }
            else { //wrong format
                System.out.println("Wrong format: must be in the form AB1234.");
            }
            
        }
        
        percentage(arr2, arr1); //method percentage
        
        /*frankenstein(arr1);
        
        print(arr1);*/ //causes exception
        
    }
    
    public static String[][][] soRandom() { 
        String x[][][] = new String[(int) ((Math.random()*10)+1)][][]; //set array
        for (int i = 0; i < x.length; i++) { //loop
            String y[][] = new String[(int) ((Math.random()*10)+1)][]; //set array
            x[i] = y; 
            for (int j = 0; j < y.length; j++) {
                String z[] = new String[(int) ((Math.random()*10)+1)]; //set array
                y[j] = z;
            }
        }
        return x; //return array
    }
    
    public static String coder() { //method coder
        char a = (char) ((Math.random()*26)+65); //set char
        char b = (char) ((Math.random()*26)+65); //set char
        String A = "" + a; //convert to str
        String B = "" + b; //convert to str
        int C = (int) (Math.random()*10); //int 1
        int D = (int) (Math.random()*10); //int 2
        int E = (int) (Math.random()*10); //int 3
        int F = (int) (Math.random()*10); //int 4
        String code = A+B+C+D+E+F; //make string
        
        
        return code; //return the code
    }
    
    
    public static void print (String[][][] x) { //method print
        for (int i = 0; i < x.length; i++) {
            
            for (int j = 0; j < x[i].length; j++) {
                System.out.print("["); //print open bracket
                for (int k = 0; k < x[i][j].length; k++) {
                    if (k == x[i][j].length-1) {
                        System.out.print(x[i][j][k]); //print element
                    }
                    else {
                        System.out.print(x[i][j][k]); //print element
                        System.out.print(", "); //print comma
                    }
                    
                    
                }
                System.out.print("]");
                if (j == x[i].length-1) {
                    if (i == x.length-1) {
                    }
                    else {
                        System.out.print("---"); //print dashes
                    }
                }
                else {
                    System.out.print("|"); //print slash
                }
            }
            
        }
    }
    
    public static String[][][] holoport(String[][][] copy, String[][][] original) { //method holoport
        int length1 = 0; 
        if (copy.length < original.length) {
            length1 = copy.length; //set length1
        }
        else {
            length1 = original.length; //set it to original
        }
        
        int[] length2 = new int[length1]; //set length 2
        int[][] length3 = new int[length1][]; //set length 3
        
        for (int i = 0; i < length1; i++) {
            if (copy[i].length < original[i].length) {
                length2[i] = copy[i].length; //set length2 elemtn
            }
            else {
                length2[i] = original[i].length; //set length 2 element to orig
            }
            length3[i] = new int[length2[i]]; //set length 3 to lenght of length2
            for (int j = 0; j < length2[i]; j++) {
                if (copy[i][j].length < original[i][j].length) {
                    length3[i][j] = copy[i][j].length; //set length3 to copy
                    for (int k = 0; k < length3[i][j]; k++) {
                        copy[i][j][k] = original[i][j][k]; //set copy to orig
                    }
                }
                else {
                    int k = 0;
                    length3[i][j] = original[i][j].length; //set length 3 to orig
                    for (k = 0; k < length3[i][j]; k++) {
                        copy[i][j][k] = original[i][j][k]; //set copy to orig
                    }
                    for (k = length3[i][j]; k < copy[i][j].length; k++) {
                        copy[i][j][k] = "$$$$$$"; //set blank elements to dollar signs
                    }
                    
                }
            }
        }
    return copy; //return array
    }
    
    public static void sampling(String input, String[][][] arr) { //method sampling
        boolean check = false; //boolean check
        while (!check) { //not check
            for (int i = 0; i < arr.length; i ++) {
                for (int j = 0; j < arr[i].length; j++) {
                    for (int k = 0; k < arr[i][j].length; k++) {
                        if (arr[i][j][k].equals(input)) { //if the element equals input
                            System.out.println("("+i+", "+j+", "+k+")"); //print indices
                            check = true; //break out of loop
                            
                            break;
                        }
                        if ((k == arr[i][j].length-1) && (i == arr.length-1) && (j == arr[i].length-1)) { //end of array
                            System.out.println("Not found."); 
                            check = true; //break out of loop
                        }
                        
                    }
                    if(check)
                        break;
                }
                if(check)
                break;
            }
        }
    }
    
    public static void percentage(String[][][] copy, String[][][] original) { //percentage method
        int numCopy = 0; //copy number
        int numOriginal = 0; //orig num
        for (int i = 0; i < copy.length; i ++) {
            for (int j = 0; j < copy[i].length; j++) {
                for (int k = 0; k < copy[i][j].length; k++) {
                    numCopy++; //count
                    
                }
            }
        }
        
        for (int i = 0; i < original.length; i ++) {
            for (int j = 0; j < original[i].length; j++) {
                for (int k = 0; k < original[i][j].length; k++) {
                    numOriginal++; //count
                    
                }
            }
        }
        
        double percent = (((double) (numCopy-numOriginal))/((double) (numOriginal)));  //calculate percent
        System.out.println("Percentage: "+percent);
    }
    
    public static String[][][] frankenstein(String[][][] arr) { //method frankenstein
        int q = 0; //declare q
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for(int k = 0; k < arr[i][j].length; k++) {
                    int letter1 = (int) arr[i][j][k].charAt(0); //set letters to ints at positions
                    int letter2 = (int) arr[i][j][k].charAt(1);
                    int number1 = arr[i][j][k].charAt(2); //find numbers at positions
                    int number2 = arr[i][j][k].charAt(3);
                    int number3 = arr[i][j][k].charAt(4);
                    int number4 = arr[i][j][k].charAt(5);
                    String totalString = letter1+""+letter2+""+number1+""+number2+""+number3+""+number4; //create as a string
                    int totalCode = Integer.valueOf(totalString);
                    int smallest = totalCode; //s
                    int index = k; //set index
                    for (q = k; k < arr[i][j].length; q++) {
                        int letter1c = (int) arr[i][j][q].charAt(0);//find letters at positions in ints
                        int letter2c = (int) arr[i][j][q].charAt(1);
                        int number1c = arr[i][j][q].charAt(2); //find numbers at positions
                        int number2c = arr[i][j][q].charAt(3);
                        int number3c = arr[i][j][q].charAt(4);
                        int number4c = arr[i][j][q].charAt(5);
                        String totalStringC = letter1+""+letter2+""+number1+""+number2+""+number3+""+number4; //create as string
                        int totalCodeC = Integer.valueOf(totalStringC);
                        if (smallest > totalCodeC) { //if smaller than previous
                            smallest = totalCodeC;
                            index = q;
                        }
                    }
                    arr[i][j][index] = arr[i][j][k]; //swap
                    arr[i][j][k] = arr[i][j][q];
                }
            }
        }
        
        
        return arr; //return array
    }
        
    
    
    
}
    
  
        
    
