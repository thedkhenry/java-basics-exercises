package com.perscholas.java_basics.exercises.monster_creation;

public class FireMonster extends Monster {
	
	public FireMonster(String name) {
		super(name);
	}

	/**
	 * Override Monster class attack method.
	 * @return the Fire monster's attack
	 */
	public String attack() {
		return "Attack with fire!";
	};
}