package com.project.RPS;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		
		while(true) {
			String[] rps= {"r", "p", "s"};
			String computerMove= rps[new Random().nextInt(rps.length)];
			
			String playerMove;
			
			while(true) {
				System.out.println("Enter your move(r, p or s)");
				playerMove= scanner.nextLine();
				if(playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
					break;
				}
				System.out.println(playerMove + "is invalid");
			}
			System.out.println("computer played: "+ computerMove);
			
			if(playerMove.equals(computerMove)) {
				System.out.println("Game was a tie!");
			}
			else if(playerMove.equals("r")) {
				if(computerMove.equals("p")) {
					System.out.println("you lose");
				}
				else if(computerMove.equals("s")) {
					System.out.println("you win");
				}
			}
			
			else if(playerMove.equals("p")) {
				if(computerMove.equals("s")) {
					System.out.println("you lose");
				}
				else if(computerMove.equals("r")) {
					System.out.println("you win");
				}
			}
			
			else if(playerMove.equals("s")) {
				if(computerMove.equals("r")) {
					System.out.println("you lose");
				}
				else if(computerMove.equals("p")) {
					System.out.println("you win");
				}
			}
			System.out.println("Play again? y/n");
			
			String playAgain= scanner.nextLine();
			if(!playAgain.equals("y")) {
				break;
			}
		}
		scanner.close();
	}

}
