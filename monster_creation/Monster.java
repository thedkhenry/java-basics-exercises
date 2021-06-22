package com.perscholas.java_basics.exercises.monster_creation;

public class Monster {
	protected String name;
	
	public Monster(String name) {
		this.name = name;
	}
	
	public Monster() {
	}

	/**
	 * Returns a string of the monsters attack
	 * @return the monster's attack
	 */
	public String attack() {
		return "!^_&amp;^$@+%$* I don't know how to attack!";
	};
}