//Kyle Albonico
//CSE2 11:10-12
//find the volume of a pyramid

import java.util.Scanner;
public class Pyramid {
    //main method
    public static void main(String[] args)  {
        Scanner myScanner=new Scanner (System.in); //declare instance of scanner
        System.out.print("The square size of the pyramid is (input length): ");
        double squareSideLength=myScanner.nextDouble(); //length of square side of pyramid
        System.out.print("The height of the pyramid is (input height): ");
        double heightLength=myScanner.nextDouble(); //length of height
        double volume; //volume of pyramid
        volume=((squareSideLength*squareSideLength)*heightLength)/3;
        System.out.println("The volume inside the pyramid is: "+volume);
        
    }
}