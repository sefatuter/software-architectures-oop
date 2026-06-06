package com.lesson.my_exercises.memento2;

public class GameMemento {

    final String health;
    final String mana;
    final int level;

    GameMemento(String health, String mana, int level){
        this.health = health;
        this.mana = mana;
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public String getHealth() {
        return health;
    }

    public String getMana() {
        return mana;
    }
}
