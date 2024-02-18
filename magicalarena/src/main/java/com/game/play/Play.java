package com.game.play;


import java.util.Random;
import java.util.Scanner;

import com.game.magicalarena.Arena;
import com.game.magicalarena.Game;
import com.game.player.Player;

public class Play {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random rand = new Random();
		String playerAName = "Player A";
		String playerBName = "Player B";
		try {
		System.out.println("Enter Player A name:");
		playerAName = s.nextLine();
		System.out.println();
		System.out.println("Enter Player B name:");
		 playerBName = s.nextLine();
		}
		catch(Exception e){
			System.out.println("input is incorect, please enter correct names ");
		}
		
		System.out.println();
		//Players in Arena
		Player PlayerA = new Player(playerAName, 50, 5, 10);
		Player PlayerB = new Player(playerBName, 100, 10, 5);
		System.out.println(PlayerA.toString());
		System.out.println(PlayerB.toString());
		System.out.println();
		
		//Arena
		Game  arena = new Arena();
		
		
		
		while(PlayerA.getHealth()>0 && PlayerB.getHealth() >0) {
			//Lets start the game
			int playerAHealth = PlayerA.getHealth();
			int playerBHealth = PlayerB.getHealth();
			
			//Player decision
			Player Attacker;
			Player Defender;
			if(playerAHealth<=playerBHealth) {
				Attacker = PlayerA;
				Defender = PlayerB;
			}
			else {
				Attacker = PlayerB;
				Defender = PlayerA;
				
			}
			
			System.out.println("Attacker "+ Attacker.getName()+" Health: "+ Attacker.getHealth());
			System.out.println("Defender "+ Defender.getName()+" Health: "+ Defender.getHealth());
			System.out.println();
			
			//Roll the Dice
			int  play = 0;
			 while (true) {
		            try {
		                System.out.println("Press 1 to start the fight");
		                play = s.nextInt();
		                break; // Break out of the loop if input is successful
		            } catch (Exception e) {
		                System.out.println("Input is incorrect. Please press 1.");
		                s.nextLine(); // Consume the invalid input
		            }
		        }
			
			if(play !=1) {
				System.out.println("Press 1 to start the fight");
				  play = s.nextInt();				
			}
			System.out.println();
			
			//Attacker 
			int diceValueForAttacker = rand.nextInt(6);
			int attackDamage = arena.attack(Attacker.getAttack(), diceValueForAttacker);
			
			//Defender
			int diceValueForDefender = rand.nextInt(6);
			int defendStrength = arena.defend(Defender.getStrength(), diceValueForDefender);
			
			//Fight
			/* Method fight
			 * @returns {damaged, healthReduced}
			 * */
			int fightResults []=arena.fight(attackDamage, defendStrength, Defender.getHealth());
			
			int previousHealth = Defender.getHealth();
			int healthReduced = fightResults[1];
			
			if(healthReduced >0) {
				Defender.setHealth(healthReduced);
			}
			else {
				Defender.setHealth(0);
			}
			
			
			System.out.println("Damage created by "+Attacker.getName()+" to "+Defender.getName()+": "+fightResults[0]);
			System.out.println("Health of "+Defender.getName()+" reduced to: "+ Defender.getHealth() +" from "+previousHealth);
			System.out.println();
			
		}
		//Winner Decalration
		Player winner = arena.winnerDeclaration(PlayerA, PlayerB);
		System.out.println("Cheers! "+winner.getName()+" won the fight: "+winner.toString());
			
	}

}
