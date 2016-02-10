// Kyle Albonico
// 2/5/16
// CSE2: 11am-12pm lab
// Provided with time in seconds and number of rotations for two trips
// Will print number of minutes, counts, distance in miles, and total distance for two trips
//
public class Cyclometer {
    // main method required for every java program
    public static void main(String[] args) {
        
    
int secsTrip1=480; //Seconds trip 1
int secsTrip2=3220; //Seconds trip 2
int countsTrip1=1561; //Counts trip 1
int countsTrip2=9037; //Counts trip 2
double wheelDiameter=27.0, //Diameter of wheel
PI=3.14159, //Value of pi
feetPerMile=5280, //Number of feet in mile
inchesPerFoot=12, //Number of inches in foot
secondsPerMinute=60; //Number of seconds in minute
double distanceTrip1, distanceTrip2, totalDistance; //Distance of trip 1, trip 2, and total distance
System.out.println("Trip 1 took"+(secsTrip1/secondsPerMinute)+"minutes and had"+countsTrip1+"counts.");
System.out.println("Trip 2 took"+(secsTrip2/secondsPerMinute)+"minutes and had"+countsTrip2+"counts.");

distanceTrip1=countsTrip1*wheelDiameter*PI; //Gives distance of trip 1 given counts and wheel diameter
distanceTrip1/=inchesPerFoot*feetPerMile; //distance in miles trip 1
distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; //distance trip 2 in miles
totalDistance=distanceTrip1*distanceTrip2; //total distance of trip 1 and 2

System.out.println("Trip 1 was "+distanceTrip1+"miles.");
System.out.println("Trip 2 was "+distanceTrip2+"miles.");
System.out.println("The total distance was "+totalDistance+"miles.");

    } //End of main method
} //end of class