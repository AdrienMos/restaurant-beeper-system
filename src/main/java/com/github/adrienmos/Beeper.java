package com.github.adrienmos;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

class Beeper {

    private final String uuid = UUID.randomUUID().toString();
    private LocalDateTime createdAt;
    private String orderName;
    private LocalDateTime calledAt;
    private LocalDateTime collectedAt;

    public Beeper(String orderName) {
        this.orderName = orderName;
        createdAt = LocalDateTime.now();
    }

    public String getOrderName() {
        return orderName;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.uuid);
    }

    @Override
    public boolean equals(Object obj) {
        //obj to jest pilot, który ma niewiele przycisków, bo tylko przyciski z klasy Object.
        if (obj instanceof Beeper) { //sprawdzamy, czy przypadkiem, ten pilot nie steruje obiektem klasy Beeper.
            Beeper that = (Beeper) obj;  //skoro steruje obiektem klasy Beeper, to możemy stworzyć nowy pilot (o nazwie that)
            // który steruje tym samym obiektem (co obj), ale ma wszystkie przyciski
            // między innymi przycisk do pobrania wartości pola uuid.
            return Objects.equals(this.uuid, that.uuid);
        }
        return false;
    }

    public void setCalledAt(LocalDateTime now) {
        this.calledAt = now;

    }

    public void createdAt(LocalDateTime now) {
        this.createdAt = now;
    }

    public void setCollectedAt(LocalDateTime now) {
        this.collectedAt = now;
    }
}