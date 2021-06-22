package com.perscholas.java_basics.exercises.monster_creation;

public class StoneMonster extends Monster {
	
	public StoneMonster(String name) {
		super(name);
	}

	/**
	 * Override Monster class attack method.
	 * @return the Stone monster's attack
	 */
	public String attack() {
		return "Attack with stones!";
	};
}