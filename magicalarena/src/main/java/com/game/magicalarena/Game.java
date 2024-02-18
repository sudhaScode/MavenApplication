package com.game.magicalarena;


public abstract class Game {

//to roll the dice
public abstract int fight(int attackDamage, int defendStrength);

//to attack player
public abstract int attack(int attack, int diceValue);

//to defend attacker
public abstract int defend(int strength, int diceValue);

//to replay 
public abstract void restart();

}
