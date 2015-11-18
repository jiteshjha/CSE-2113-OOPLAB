import java.util.Scanner;
import java.io.IOException;

class Card {
	int rank;
	char suit;
	Card(int rank, char suit) {
		this.rank = rank;
		this.suit = suit;
	}
	char getSuit() {
		return suit;
	}
	
	int getRank() {
		return rank;
	}
}

class CardTester {
	public static void main(String[] args) throws java.io.IOException {
		int rank1 = 0, rank2 = 0, count1 = 0, count2 = 0, rank;
		char suit;
		Scanner in = new Scanner(System.in);
		Card card[] = new Card[5];

		for(int i = 0; i < 5; i++) {
			System.out.println("\nCard " + (i+1) + ": Enter rank. ");
			rank = in.nextInt();
			System.out.println("\nCard " + (i+1) + ": Enter suit. ");
			suit = (char)System.in.read();
			card[i] = new Card(rank, suit);
			if(rank1 == 0) {
				rank1 = rank;
				count1++;
			}
			else if(rank2 == 0 && rank1 != rank ) {
				rank2 = rank;
				count2++;
			}
			else if(rank1 == rank) { 
				count1++;
			}
			else if(rank2 == rank)
				count2++;
		}
		System.out.println("\nCards are : ");
		for(int i = 0; i < 5; i++) {
			System.out.println("Card " + (i+1) + ": rank: " + card[i].getRank());
			System.out.println("Card " + (i+1) + ": suit: " + card[i].getSuit());
		}
		if((count1 == 2 && count2 == 3)||(count1 == 3 && count2 == 2))
			System.out.print("\nHousefull!\n");
		else
			System.out.print("\nNot Housefull!\n");
		}
}
		
