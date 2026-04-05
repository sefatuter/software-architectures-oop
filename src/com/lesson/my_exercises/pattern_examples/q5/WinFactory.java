package com.lesson.my_exercises.pattern_examples.q5;

public class WinFactory extends AbstractFactory{

    @Override
    CheckBox getCheckbox(String type) {
        if (type.equals("Checkbox")){
            return new WinCheckBox();
        }
        return null;
    }

    @Override
    Button getButton(String type) {
        if (type.equals("Button")){
            return new WinButton();
        }
        return null;
    }
}
