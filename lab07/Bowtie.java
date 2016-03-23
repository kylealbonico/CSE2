//Kyle Albonico
//CSE2 11:10-12
//

public class Bowtie {
    public static void main(String[] args) {
        
        int nStars = 9;
        int counter = 9;
        String asterisk = "*";
        
        while (nStars > 1) {
            System.out.print(asterisk);
            nStars--;
        }
            while (nStars == 9 && counter > 1) { //need to print counter number of times
                System.out.println(asterisk);
                counter = counter - 2;
            }
    }
}