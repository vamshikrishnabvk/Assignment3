package assignment3;

import java.util.Scanner;

class Guessnum
{
	int guessNum;
	int guessNum()
	{
		
		System.out.println("gusser guess the number");
		Scanner sc=new Scanner(System.in);
		guessNum=sc.nextInt();
		if(guessNum>9) 
		{
			System.out.println("guess in range of 0-9");
		}
		return guessNum;
		
	}
}
class Player
{
	int guessNum;
	int guessNum()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("guess the number player ");
		guessNum=sc.nextInt();
		return guessNum;
	}
}
class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	void collectNumFromGuesser()
	{
		
		Guessnum g=new Guessnum();
		numFromGuesser=g.guessNum();
	}
	void collectNumFromPlayer()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		numFromPlayer1=p1.guessNum();
		numFromPlayer2=p2.guessNum();
		numFromPlayer3=p3.guessNum();
	}
	
	void compare()
	{
		if(numFromGuesser==numFromPlayer1)
		{
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
			{
				System.out.println("All players won the game");
			}
			else if(numFromGuesser==numFromPlayer2 )
			{
				System.out.println("Player 1 & Player2 won");
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 1 & Player3 won");
			}
			else
			System.out.println("player 1 won the game");
		}
		else if(numFromGuesser==numFromPlayer2)
		{
			if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 2 & Player3 won");
			}
			else
			System.out.println("player 2 won the game");
		}
		else if(numFromGuesser==numFromPlayer3)
		{
			System.out.println("player 3 won the game");
		}
		else if(numFromPlayer1==numFromPlayer2 && numFromPlayer1==numFromPlayer3)
		{
			System.out.println("Game tie between 2 players Try Again");
		}
		
		else
		{
			System.out.println("try again Game lost");
		}
	}
	
}

public class guessergame {

	public static void main(String[] args) {
		Umpire u=new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayer();
		u.compare();
		

	}

}