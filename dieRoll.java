/**
 * Ashley Clark
 * Dice Roll
 * A program that prompts the user to enter 2 ints to decide how many faces of the dice there will be
 * The program then produces the output of the most probable sum.
 * 
 */


import java.util.Scanner;

public class dieRoll {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter two ints, each between 4 and 20: ");
		int M = input.nextInt();
		int N = input.nextInt();
	//statement to check if N or M is the highest number, then goes through the loop to produce the output.
	  if (N<M) {
		  int maxM= M+1;
		  int minN= N+1;
		  for(int i=minN; i<=maxM&&i>=minN; i++) {//loop determined by pattern that the output should be the min number +1 up through the max +1
			  System.out.println(i);
		  }
	  } 
			  else if(N>M) {
				  int maxN= N+1;
				  int minM= M+1;
				  for(int i= minM; i<=maxN && i>=minM; i++) {
					  System.out.println(i);
				  }
			  }
		  
			  else if(M==N) {// if the numbers are equal the output will be M or N +1
		  System.out.print(N+1);
	  }
	   
	}
}
	
