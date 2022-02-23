package com.company;

public class Medic {
    private double healPoints = 15.0;

    public double getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(double healPoints) {
        this.healPoints = healPoints;
    }

    public void increase_experience() {
        for (double i = 0; i < healPoints; i+= 1.5) {
            System.out.println("Опыт лечения медика " + i);
        }
    }

    public void applySuperAbility() {
        System.out.println("Medic лечит героев");
    }
}


