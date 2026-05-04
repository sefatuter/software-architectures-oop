package com.lesson.memento;

public class ToyCar {
    public String _color;

    public String GetColor() { return _color; }
    public void SetColor(String value)
    {
        _color = value;
        System.out.println("Car color changed to " + _color);
    }

    public ToyCarMemento SaveState()
    {
        return new ToyCarMemento(GetColor());
    }

    public void RestoreState(ToyCarMemento memento)
    {
        SetColor(memento.Color);
    }
}
