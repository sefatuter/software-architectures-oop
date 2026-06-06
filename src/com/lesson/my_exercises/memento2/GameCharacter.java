package com.lesson.my_exercises.memento2;

public class GameCharacter {
    private String health;
    private String mana;
    private int level;

    GameCharacter(String health, String mana, int level){
        this.health = health;
        this.mana = mana;
        this.level = level;
    }

    public void takeDamage(String damageHealth, String spendMana, int newLevel) {
        this.health = damageHealth;
        this.mana = spendMana;
        this.level = newLevel;
    }

    GameMemento save(){
        return new GameMemento(health,mana,level);
    }

    void restore(GameMemento memento){
        this.health = memento.health;
        this.mana = memento.mana;
        this.level = memento.level;
    }

    @Override
    public String toString() {
        return "Character State -> Health: " + health + ", Mana: " + mana + ", Level: " + level;
    }
}
