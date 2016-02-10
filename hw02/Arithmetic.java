//Kyle Albonico
//CSE2
//
public class Arithmetic {
    //main method
    public static void main(String[] args) {
//Number of pairs of pants
int numberPants=3;
//cost per pair of pants
double pantsPrice=34.98;

//number of sweatshirts
int numberShirts=2;
//cost per sweatshirt
double shirtPrice=24.99;

//number of belts
int numberBelts=1;
//cost per belt
double beltCost=33.99;

//tax rate
double paSalesTax=.06;

double totalCostOfPantsDouble; //total cost of pants double
double totalCostOfShirtsDouble; //total cost of shirts double
double totalCostOfBeltsDouble; //total cost of belts double
double totalCostOfPants; //total cost of pants
double totalCostOfShirts; //total cost of shirts
double totalCostOfBelts; //total cost of belts

totalCostOfPantsDouble=pantsPrice*numberPants*100; //total cost of pants times 100
int totalCostOfPantsInt= (int)totalCostOfPantsDouble; //convert cost of pants times 100 to an integer
totalCostOfPants=totalCostOfPantsInt/100.0; //total cost of pants
System.out.println("The total cost of pants was $"+totalCostOfPants);

totalCostOfShirtsDouble=shirtPrice*numberShirts*100; //total cost of shirts times 100
int totalCostOfShirtsInt=(int)totalCostOfPantsDouble; //convert cost of shirts times 100 to integer
totalCostOfShirts=totalCostOfShirtsInt/100.0; //total cost of shirts
System.out.println("The total cost of shirts was $"+totalCostOfShirts);

totalCostOfBeltsDouble=beltCost*numberBelts*100; //total cost of belts times 100
int totalCostOfBeltsInt=(int)totalCostOfBeltsDouble; //convert cost of belts times 100 to integer
totalCostOfBelts=totalCostOfBeltsInt/100.0; //total cost of belts
System.out.println("The total cost of belts was $"+totalCostOfBelts);

double salesTaxPantsDouble; //sales tax charged on pants double
double salesTaxShirtsDouble; //sales tax charged on shirts double
double salesTaxBeltsDouble; //sales tax charged on belts double
double salesTaxPants; //sales tax charged on pants
double salesTaxShirts; //sales tax charged on shirts
double salesTaxBelts; //sales tax charged on belts

salesTaxPantsDouble=paSalesTax*totalCostOfPants*100; //sales tax on pants times 100
int salesTaxPantsInt=(int)salesTaxPantsDouble; //convert tax on pants times 100 to integer
salesTaxPants=salesTaxPantsInt/100.0; //sales tax on pants
System.out.println("The sales tax on pants was $"+salesTaxPants);

salesTaxShirtsDouble=paSalesTax*totalCostOfShirts*100; //sales tax on shirts times 100
int salesTaxShirtsInt=(int)salesTaxShirtsDouble; //convert tax on shirts times 100 to integer
salesTaxShirts=salesTaxShirtsInt/100.0; //sales tax on shirts
System.out.println("The sales tax on shirts was $"+salesTaxShirts);

salesTaxBeltsDouble=paSalesTax*totalCostOfBelts*100; //sales tax on belts times 100
int salesTaxBeltsInt=(int)salesTaxBeltsDouble; //convert tax on belts times 100 to integer
salesTaxBelts=salesTaxBeltsInt/100.0; //sales tax on belts
System.out.println("The sales tax on belts was $"+salesTaxBelts);

double totalCostOfPurchases; //total cost of purchases
totalCostOfPurchases=totalCostOfPants+totalCostOfShirts+totalCostOfBelts; //total cost of purchases equation
System.out.println("The total cost of purchases was $"+totalCostOfPurchases);

double totalSalesTax; //total sales tax
totalSalesTax=salesTaxPants+salesTaxShirts+salesTaxBelts; // total sales tax equation
System.out.println("The total sales tax was $"+totalSalesTax);

double totalPaidForTransaction; //total paid for this transaction, including sales tax
totalPaidForTransaction=totalCostOfPurchases+totalSalesTax; //total paid for this transaction equation
System.out.println("The total paid for this transaction was $"+totalPaidForTransaction);

    }//end of main method
}//end of class