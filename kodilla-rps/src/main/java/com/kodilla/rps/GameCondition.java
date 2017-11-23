package com.kodilla.rps;

public class GameCondition {

    private String condition;

    public String getCondition() {
        return condition;
    }

    public GameCondition(String condition) {
        this.condition = condition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GameCondition that = (GameCondition) o;

        return condition.equals(that.condition);
    }

    @Override
    public int hashCode() {
        return condition.hashCode();
    }

    @Override
    public String toString() {
        return "Player pick - Computer pick: "
                 + condition;
    }
}
