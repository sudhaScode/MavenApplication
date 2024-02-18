package com.game.magicalarena;

import java.util.Random;

import com.game.player.Player;

public class Arena extends Game{

	@Override
	public int[] fight(int attackDamage, int defendStrength, int defenderHealth) {
		// TODO Auto-generated method stub
		
		int damaged = defendStrength<attackDamage?attackDamage-defendStrength:defendStrength-attackDamage;
		int healthReduced = defenderHealth-damaged;
		int fightResults[] = {damaged, healthReduced};
		
		return fightResults;
	}

	@Override
	public int attack(int attack, int diceValue) {
		// TODO Auto-generated method stub
	
		int attackingPower = attack*diceValue;
		return attackingPower;
	}

	@Override
	public int defend(int strength, int diceValue) {
		// TODO Auto-generated method stub
		
		int defendingStrength = strength*diceValue;
		return defendingStrength;
	}

	@Override
	public Player winnerDeclaration(Player A, Player B) {
		// TODO Auto-generated method stub
		if(A.getHealth() == 0) {
			return B;
		}
		else {
			return A;			
		}	
			
	}
}
