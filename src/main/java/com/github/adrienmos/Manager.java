package com.github.adrienmos;

import java.time.LocalDateTime;

class Manager {

    private CashDesk cashDesk;
    private Kitchen kitchen;
    private Giveaway giveaway;

    public Manager(CashDesk cashDesk, Kitchen kitchen, Giveaway giveaway) {
        this.cashDesk = cashDesk;
        this.kitchen = kitchen;
        this.giveaway = giveaway;
    }

    public void newOrder(String orderName) {
        Beeper beeper = new Beeper(orderName);
        prepareMeal(beeper);
    }

    public void prepareMeal(Beeper beeper) {
        kitchen.prepareMeal(beeper);
    }

    public void mealReady(Beeper beeper) {
        beeper.createdAt(LocalDateTime.now());


    }

    public void callCustomer(Beeper beeper) {
        beeper.setCalledAt(LocalDateTime.now());


    }

    public void customerCollectedOrder(Beeper beeper) {
        beeper.setCollectedAt(LocalDateTime.now());
        }

    }




