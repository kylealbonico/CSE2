//Kyle Albonico
//CSE2 11:10-12
//Deletes elements and values from random arrays

import java.util.Scanner;
public class RemoveElements{
  public static void main(String [] arg) {
	Scanner scan=new Scanner(System.in);
int num[]=new int[10];
int newArray1[];
int newArray2[];
int index,target;
	String answer="";
	do{
  	System.out.print("Random input 10 ints [0-9]");
  	num = randomInput();
  	String out = "The original array is:";
  	out += listArray(num);
  	System.out.println(out);
 
  	System.out.print("Enter the index ");
  	index = scan.nextInt();
  	newArray1 = delete(num,index);
  	String out1="The output array is ";
  	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out1);
 
      System.out.print("Enter the target value ");
  	target = scan.nextInt();
  	newArray2 = remove(num,target);
  	String out2="The output array is ";
  	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out2);
  	 
  	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	answer=scan.next();
	}while(answer.equals("Y") || answer.equals("y"));
  }
 
  public static String listArray(int num[]){
	String out="{";
	for(int j=0;j<num.length;j++){
  	if(j>0){
    	out+=", ";
  	}
  	out+=num[j];
	}
	out+="} ";
	return out;
  }
	
	public static int[] randomInput() { //method random input
		int[] list; //new array
		list = new int[10]; //10 elements
		for(int i=0; i < 10; i++) { //from 0 to 10
			list[i] = (int) ((Math.random()*10)); //produce random number from 0 to 10
		}
	return list; //return the array
	}
	
	public static int[] delete(int[] list, int pos) { //method delete
		int[] newList = new int[list.length-1]; //make a new list
		int trigger = 0; //initialize trigger
		if(pos>=0 && pos<=10) {
		for (int i = 0; i < newList.length; i++) {
			if (i==pos) { //if position equals i
			newList[i] = list[i+1]; //incrememnt the index
			trigger = 1; //turn on trigger
			}
			else if (trigger == 1) { //if trigger is on
				newList[i] = list[i+1]; //increment list
			}
			
			else if (trigger == 0) { //trigger is off
			newList[i] = list[i]; //don't increment list
			}
		}
		return newList; //return the array
		}
		else {
			System.out.println("The index is not valid");
			return list; //return list
		}
	}
	
	public static int[] remove(int[] list, int target) { //method remove
		int counter = 0; //initialize counter
		int trigger = 0; //initialize trigger
		for (int i = 0; i < list.length; i++) { //from i to list length
			if (list[i] == target) { //if value is the input
				counter++; //increment counter
			}
			
		}
		
		if (counter > 0) { //found
			System.out.println("Element "+target+" has been found.");
		}
		
		else { //not found
			System.out.println("Element "+target+" has not been found.");
		}
		
		int[] newList = new int[(list.length)-counter]; //new list with less values
		
		for (int j = 0; j < list.length; j++) { //until loop reaches end of list
			if (list[j] == target) { //if selected value dont copy it
			}
			
			else { //if not selected value
				newList[trigger] = list[j]; //set it to the trigger
				trigger++; //increment trigger
			}
		}
		
		return newList; //return the new list
	}
	
}
