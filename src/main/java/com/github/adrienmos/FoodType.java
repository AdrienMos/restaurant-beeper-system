package com.github.adrienmos;

enum FoodType {
    WELL_DONE_BURGER(30000),
    FRYTKI(10000),
    ZIELSKO(5000),
    NACHOSY(3000),
    SERUS(20000);


    private int preparationDurationMillis;

    FoodType(int preparationDurationMillis) {
        this.preparationDurationMillis = preparationDurationMillis;
    }

    public int getPreparationDurationMillis() {
        return preparationDurationMillis;
    }

    public static FoodType fromStringIgnoreCase(String name) throws IllegalFoodException {
        for (FoodType value : values()) {
            if (value.name().equalsIgnoreCase(name)) {
                return value;
            }
        }
        throw new IllegalFoodException();
    }
}