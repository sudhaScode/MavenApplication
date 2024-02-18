package com.game.magicalarena;

import com.game.player.Player;

public abstract class Game {

//to roll the dice
public abstract int[] fight(int attackDamage, int defendStrength, int defenderHealth);

//to attack player
public abstract int attack(int attack, int diceValue);

//to defend attacker
public abstract int defend(int strength, int diceValue);

//to replay 
public abstract Player winnerDeclaration(Player A, Player B);

}
