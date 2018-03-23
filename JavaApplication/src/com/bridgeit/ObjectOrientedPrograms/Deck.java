package com.bridgeit.ObjectOrientedPrograms;


import com.bridegit.Utility.Utility;

public class Deck {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []suits= {"Club", "Diamond","Heart", "Spade"};
		String [] Rank= {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		Utility u=new Utility();
		u.DeckOfCards(Rank, suits);
		
	}
	
	
	

}


