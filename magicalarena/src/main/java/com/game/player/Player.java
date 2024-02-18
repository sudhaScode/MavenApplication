package com.game.player;


public class Player {
	
	private int health;
	private int strength;
	private int attack;
	private String name;

	//Constructor
	public Player(String name,int health, int strength, int attack) {
		this.name = name;
		this.health = health;
		this.strength = strength;
		this.attack = attack;		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	@Override
	public String toString() {
		return "Player [health=" + health + ", strength=" + strength + ", attack=" + attack + ", name=" + name + "]";
	}


	

}
