//Kyle Albonico
//CSE2 11:10-12
//

public class Bowtie {
    public static void main(String[] args) {
        
        int nStars = 9;
        
        for (int counter1 = nStars; counter1 >= 1; counter1 = counter1 - 2) {
            for (int counter2 = counter1; counter2 >= 1; counter2 = counter2--) {
            System.out.print("*");
            }
            System.out.println("");
        }
        /*
        for (int counter = 1; counter < nStars; counter++) {
            System.out.print("*");
        }
        */
        
        
        
        /*while (nStars > 1) {
            System.out.print(asterisk);
            nStars--;
        }
            while (nStars == 9 && counter > 1) { //need to print counter number of times
                System.out.println(asterisk);
                counter = counter - 2;
            }*/
    }
}
