package com.kodilla.patterns.prototype;

import java.util.HashSet;
import java.util.Set;

public class Board extends Prototype {
    String name;
    Set<TasksList> lists = new HashSet<>();

    public Board(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<TasksList> getLists() {
        return lists;
    }

    @Override
    public String toString() {
        String s = "Board [" + name + "]\n";
        for(TasksList list : lists) {
            s = s + list.toString() + "\n";
        }
        return s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Board board = (Board) o;

        if (!name.equals(board.name)) return false;
        return lists.equals(board.lists);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + lists.hashCode();
        return result;
    }

    public Board shallowCopy() throws CloneNotSupportedException {
        return (Board)super.clone();
    }

    public Board deepCopy() throws CloneNotSupportedException {
        Board clonedBoard = (Board)super.clone();
        System.out.println(clonedBoard.lists.size());
        clonedBoard.lists = new HashSet<>();
        System.out.println(clonedBoard.lists.size());
        for(TasksList theList : lists) {

            TasksList clonedList = new TasksList(theList.getName());
            for(Task task : theList.getTasks()) {
                clonedList.getTasks().add(task);
            }
            clonedBoard.getLists().add(clonedList);
        }
        return clonedBoard;
    }
}
