//Kyle Albonico
//CSE 2 11:10-12:00
//Determines how much people in a party need to pay to split a check
import java.util.Scanner;
public class Check {
    //main method
    public static void main(String[] args) {
        
Scanner myScanner=new Scanner (System.in); //declare instance of scanner

System.out.print("Enter the original cost of the check in the form xx.xx: ");

double checkCost=myScanner.nextDouble(); //check cost

System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): ");
double tipPercent=myScanner.nextDouble(); //tip percent
tipPercent /=100; //convert percentage into decimal
System.out.print("Enter the number of people who went out to dinner: ");
int numPeople=myScanner.nextInt();

double totalCost; //total cost
double costPerPerson; //cost per person
int dollars, //whole dollar amount of cost
    dimes, pennies; //for storing digits to the right of the decimal point for th cost$
totalCost=checkCost*(1+tipPercent);
costPerPerson=totalCost/numPeople;
dollars=(int)costPerPerson;
//get dimes amt, e.g., (int)(6.73*10)%10->7 where the % (mod) operator returns the remainder after the division: 583%100->83,27%5->2
dimes=(int)(costPerPerson*100)%10;
pennies=(int)(costPerPerson*100)%10;
System.out.println("Each person in the group owes $"+dollars+"."+dimes+pennies);

    }
}