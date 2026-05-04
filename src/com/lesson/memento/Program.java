package com.lesson.memento;

public class Program {
    public static void main(String[] args) {
        var car = new ToyCar();

        var changer = new ColorChanger();

        changer.ChangeColor(car, "Red");

        var savedState = car.SaveState();

        changer.ChangeColor(car, "Blue");
        changer.ChangeColor(car, "Green");

        changer.UndoColorChange(car);

        System.out.println("Current car color : " + car.GetColor());

        car.RestoreState(savedState);

        System.out.println("Restored car color : " +car.GetColor());

    }
}
