package com.lesson.march_30_q1;

public abstract class Shape {
    public String Type{get; set;}
    public Color color{get; set;}

    public Shape(Color color, String type){
        Color = color;
        Type = type;
    }

    public override string ToString(){
        return $'I am a {Color.log()} {Type}';
    }
}
