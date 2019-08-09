package com.github.adrienmos;

import javax.swing.*;


class Application {

    public static void main(String[] args) {

        Kitchen kitchen = new Kitchen();
        Giveaway giveaway = new Giveaway();
        CashDesk cashDesk = new CashDesk();

        Manager manager = new Manager(cashDesk, kitchen, giveaway);

        kitchen.setManager(manager);
        giveaway.setManager(manager);
        cashDesk.setManager(manager);

        String input = JOptionPane.showInputDialog("Co byś zjadł?");
        System.out.println(input);


        try {
            FoodType frytki = FoodType.valueOf(input.toUpperCase());
            System.out.print("czas przygotowania: ");
            System.out.print(frytki.getPreparationDurationMillis());
            System.out.print(" milisekund. Proszę czekać");
            Thread.sleep(frytki.getPreparationDurationMillis());
        } catch (IllegalArgumentException e) {
            System.out.println("Takie danie nie istnieje!, przynajmniej u nas");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {

        } catch (IllegalArgumentException e) {
            System.out.println("nieodpowiedni znak");
        }
//        FoodType frytki = FoodType.FRYTKI;
//        System.out.println(frytki.getPreparationDurationMillis());
//        FoodType burger = FoodType.WELL_DONE_BURGER;
//        System.out.println(burger.name());

//        for (FoodType value : FoodType.values()) {
//            System.out.println(value);
//        }

    }
}
