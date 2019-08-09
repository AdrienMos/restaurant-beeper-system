package com.github.adrienmos;

import java.util.Timer;

class Kitchen {

    private Manager manager;

    public Kitchen() {
    }

    public void prepareMeal(Beeper beeper) {
        MealPreparation mealPreparation = new MealPreparation(this, beeper);
        Timer timer = new Timer();
        timer.schedule(mealPreparation, 5000);
    }

    public void mealReady(Beeper beeper) {
        System.out.println("I'm back " + beeper.getOrderName());
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}