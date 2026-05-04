package com.lesson.memento;

public class ColorChanger {
    private ToyCarMemento _memento;

    public void ChangeColor(ToyCar car, String color)
    {
        _memento = car.SaveState();
        car.SetColor(color);
    }

    public void UndoColorChange(ToyCar car)
    {
        car.RestoreState(_memento);
    }
}
