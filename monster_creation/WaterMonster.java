package com.perscholas.java_basics.exercises.monster_creation;

public class WaterMonster extends Monster {
	
	public WaterMonster(String name) {
		super(name);
	}

	/**
	 * Override Monster class attack method.
	 * @return the Water monster's attack
	 */
	public String attack() {
		return "Attack with water!";
	};
}