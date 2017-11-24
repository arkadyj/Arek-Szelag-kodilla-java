package com.kodilla.rps;

public class RpsRunner {


    public static void main(String[] args) {

        MenuRunner menu = new MenuRunner();

        while (!menu.isEnd()) {
            menu.gameMenu();
        }
    }
}
