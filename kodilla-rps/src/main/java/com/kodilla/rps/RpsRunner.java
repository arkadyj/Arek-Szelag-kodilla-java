package com.kodilla.rps;

import java.util.Scanner;



public class RpsRunner {


    public static void main(String[] args) {


        Game game = new Game();


        while(!game.isEnd()){
            game.gameMenu();


        }




/*       do {
            logic.menu();

         } while(input.inputFromKeyborad()!=2);*/

    }
}
