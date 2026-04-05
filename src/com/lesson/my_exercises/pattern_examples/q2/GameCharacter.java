package com.lesson.my_exercises.pattern_examples.q2;

public class GameCharacter {
    private String name, rank;

    private GameCharacter(Builder builder){
        this.name = builder.name;
        this.rank = builder.rank;
    }

    public static class Builder{
        private String name, rank;

        public Builder setName(String name){
            this.name = name;
            return this;
        }

        public Builder setRank(String rank){
            this.rank = rank;
            return this;
        }

        public GameCharacter build(){
            return new GameCharacter(this);
        }
    }


}
