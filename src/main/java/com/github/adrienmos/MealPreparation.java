package com.github.adrienmos;

import java.util.TimerTask;

class MealPreparation extends TimerTask {

    private Kitchen kitchen;
    private Beeper beeper;

    public MealPreparation(Kitchen kitchen, Beeper beeper) {
        this.kitchen = kitchen;
        this.beeper = beeper;
    }

    @Override
    public void run() {
        kitchen.mealReady(beeper);
    }
}