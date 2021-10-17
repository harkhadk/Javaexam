package java_prep;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomNo {

	public static void main(String[] args) {
		
		int start = 0;
        int end = 500;
        int counter = 500;

        int smallest;
        int greatest;
        int randomInt ;

        int numbers [] = new int[500];
        Random random = new Random(); 

        randomInt = random.nextInt(end-start) + start;
        numbers [0] = randomInt;

        smallest = randomInt;
        greatest = randomInt;


             for(int i=1;i<500;i++) {

            numbers[i] = random.nextInt(end-start) + start;

            smallest = Math.min(smallest,numbers[i]);
            greatest = Math.max(greatest,numbers[i]);

            
            
            System.out.println(" Smallest random is : " + smallest );
            
            System.out.println("Please enter smallest number");
    		Scanner scanner= new Scanner(System.in);
    		int n =scanner.nextInt();


        }
		}
	}


