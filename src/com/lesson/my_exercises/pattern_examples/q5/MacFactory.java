package com.lesson.my_exercises.pattern_examples.q5;

public class MacFactory extends AbstractFactory{

    @Override
    Button getButton(String type) {
        if (type.equals("Button")){
            return new MacButton();
        }
        return null;
    }

    @Override
    CheckBox getCheckbox(String type) {
        if (type.equals("Checkbox")){
            return new MacCheckBox();
        }
        return null;
    }
}
