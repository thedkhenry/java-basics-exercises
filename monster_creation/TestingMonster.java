package com.perscholas.java_basics.exercises.monster_creation;

public class TestingMonster {

	public static void main(String[] args) {
		Monster m1 = new FireMonster("r2u2"); // upcast
		Monster m2 = new WaterMonster("u2r2");
		Monster m3 = new StoneMonster("r2r2");
		System.out.println(m1.attack()); // Run FireMonster's attack()
		System.out.println(m2.attack()); // Run WaterMonster's attack()
		System.out.println(m3.attack()); // Run StoneMonster's attack()
		// m1 dies, generate a new StoneMonster instance and re-assign to m1.
		m1 = new StoneMonster("a2b2"); // upcast
		System.out.println(m1.attack()); // Run StoneMonster's attack()
		Monster m4 = new Monster("u2u2");
		System.out.println(m4.attack()); // Run Monster's attack()
	}
}