package exception.arrayoutofbound;

import java.util.Random;

public class Cricket {
        public static void main(String[] args) {
            int ind[]= new int[5];
            int Aus[]= new int[5];
	Random rand = new Random();		
		for ( int roll = 0 ; roll < 6 ; roll++ ) {
			++ind[1 + rand.nextInt(6)];
		}
                for ( int roll = 0 ; roll < 6 ; roll++ ) {
			++Aus[1 + rand.nextInt(6)];
		}
                System.out.println(" Face\tFrequency");
		
		for ( int face = 1 ; face < ind.length ; face++ ) {
			System.out.println("  " + face + " \t  " + ind[face]);
		}
                for ( int face = 1 ; face < Aus.length ; face++ ) {
			System.out.println("  " + face + " \t  " + Aus[face]);
		}
		}
}                   
