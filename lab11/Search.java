//Kyle Albonico
//CSE2 11:10-12
//

import java.util.Random; //import random class
public class Search {
    public static void main(String[] args) {
        
        int[] array1 = new int [50];
        Random randomGenerator = new Random();
        int i = 0;
        for (i = 0; i < 50; i++) {
            int array1val = randomGenerator.nextInt(100);
            array1[i] = array1val;
        }
        
        int indexMin = 0;
        int min = array1[0];
        for (i=1; i < array1.length; i++) {
            if (array1[i] < min) {
                min = array1[i];
                indexMin = i;
            }
        }
        
        System.out.println("min: "+min);
        
        int indexMax = 0;
        int max = array1[0];
        for (i=1; i < array1.length; i++) {
            if (array1[i] > max) {
                max = array1[i];
                indexMax = i;
            }
        }
        System.out.println("Max: "+max);
        
    }
}