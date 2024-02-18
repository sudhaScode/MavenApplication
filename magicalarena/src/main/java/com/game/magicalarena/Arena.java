package com.game.magicalarena;

import java.util.Random;

import com.game.player.Player;

public class Arena extends Game{

	@Override
	public int fight(int attackDamage, int defendStrength) {
		// TODO Auto-generated method stub
		int damaged = defendStrength<attackDamage?attackDamage-defendStrength:defendStrength-attackDamage;
		
		
		return damaged;
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
	public void restart() {
		// TODO Auto-generated method stub
			
	}
}
