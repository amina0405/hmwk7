package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hero[] attackTypes = {new Magic(), new Warrior(), new Medic()};

        for (int i = 0; i < attackTypes.length; i++) {
            attackTypes[i].applySuperAbility();
            if (attackTypes[i] instanceof Medic) {
                ((Medic) attackTypes[i]).increase_experience();
            }
        }
    }
}

