//Kyle Albonico
//CSE2 11:10-12
//

public class Bowtie {
    public static void main(String[] args) {
        
        int nStars = 9;
        
        for (nStars = -9; nStars <= 9; nStars=nStars+2) {
            for (int spaces = Math.abs(nStars); spaces < 9; spaces=spaces+2) {
                System.out.print(" ");
            }
            for (int j = Math.abs(nStars); j > 0; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
            
        
        
        
        
        /*int nStars = 9;
        int counter = 9;
        int j = 4;
        
        
        while (nStars > 0) {
            while (counter > 0) {
                System.out.print("*");
                counter--;
            }
            
            System.out.println("");
            for (int i = j; i < 5; i++) {
                System.out.print(" ");
                
            }
            
            j--;
            
            nStars = nStars - 2;
            counter = nStars;
        }*/
        
    }
}
