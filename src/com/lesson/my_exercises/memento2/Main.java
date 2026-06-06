package com.lesson.my_exercises.memento2;

public class Main {
    public static void main(String[] args) {
        CheckpointManager checkpointManager = new CheckpointManager();

        GameCharacter character = new GameCharacter("100", "50", 10);
        System.out.println("Initial: " + character);

        checkpointManager.saveCheckpoint(character.save());
        System.out.println("[System] Checkpoint saved.\n");

        character.takeDamage("60", "10", 12);
        System.out.println("After Damage: " + character);

        character.restore(checkpointManager.undo());
        System.out.println("[System] Restored to last checkpoint...");

        System.out.println("Restored: " + character);
    }
}
