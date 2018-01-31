// A small shipping box can hold 1 "piece," whereas a large shipping box can hold 4-6 "pieces."
// This app will find the minimum number of shipping boxes needed for any number of pieces.

import java.util.Scanner;

public class BoxesAndPiecesApp {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to the Shipping Box Optimizer!\n");		
		
		String choice = "y";
		while(choice.equalsIgnoreCase("y")) {
			System.out.print("Enter the total number of pieces needed to ship: ");
			int nbrOfPieces = sc.nextInt();	
	
			int nbrLargeBoxes = nbrOfPieces/6;
			int remainderPieces = nbrOfPieces % 6;
			int nbrSmallBoxes = remainderPieces;
			
			if(nbrOfPieces <= 3) {
				nbrSmallBoxes = remainderPieces;
			} else if(remainderPieces != 0 && remainderPieces != 1) {
				nbrLargeBoxes++;
				nbrSmallBoxes = 0;
			}		
			
			int totalNbrBoxes = nbrSmallBoxes + nbrLargeBoxes;
			System.out.println("A total of "+ totalNbrBoxes + " box(es) will be needed: "
								+ nbrSmallBoxes+" small box(es) and "+nbrLargeBoxes+ " large box(es)." );
			
			System.out.print("\nTry again with a different number of pieces?(y/n): ");
			choice = sc.next();
			System.out.println();
		}	
		System.out.println("Bye");
		sc.close();
	}

}
