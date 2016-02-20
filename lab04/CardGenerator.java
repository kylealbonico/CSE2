//Kyle Albonico
//CSE2 11:10-12
//This program generates a random card in a deck of cards

public class CardGenerator{
    //main method
    public static void main(String[]args) {
    String suit="";
    String royal="";
    int number=0;
    
    int randomNumber = (int)(Math.random()*52)+1; //generate random number from 1-52
    int myRemainder = randomNumber%13; //use remainder to find card number
    
    
    if (randomNumber>=1&&randomNumber<=13){
        suit="diamonds"; //suit is diamonds
    }
     
    if (randomNumber>=14&&randomNumber<=26){
        suit="clubs"; //suit is clubs
    }
     
    if (randomNumber>=27&&randomNumber<=38){
        suit="hearts"; //suit is hearts
    }
     
    if (randomNumber>=39&&randomNumber<=52){
        suit="spades"; //suit is spades
    }
    
    switch (myRemainder){ //used remainder to find the value of the card
        case 0:
            number=2;
        break;
        case 1:
            number=3;
        break;
        case 2:
            number=4;
        break;
        case 3:
            number=5;
        break;
        case 4:
            number=6;
        break;
        case 5:
            number=7;
        break;
        case 6:
            number=8;
        break;
        case 7:
            number=9;
        break;
        case 8:
            number=10;
        break;
        case 9:
            royal="Jack";
        break;
        case 10:
            royal="Queen";
        break;
        case 11:
            royal="King";
        break;
        case 12:
            royal="Ace";
        break;
    }
     
    if (myRemainder>=9){
        System.out.println("You picked the "+royal+" of "+suit); //for numbered cards
        }
        else 
        System.out.println("You picked the "+number+" of "+suit); //for royal/ace cards
    
    
        
    
}
}


