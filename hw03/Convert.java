//Kyle Albonico
//CSE2 11:10-12
//convert meters to inches
import java.util.Scanner;
public class Convert {
    //main method
    public static void main(String[] args)  {
        Scanner myScanner=new Scanner (System.in); //declare instance of scanner
        System.out.print("Enter the distance in meters: ");
        double distanceMeters=myScanner.nextDouble(); //distance in meters
        double distanceInches; //distance in inches
        distanceInches=distanceMeters*39.3701; //convert meters to inches
        System.out.println(distanceMeters+" meters is "+distanceInches+" inches.");

    }
}