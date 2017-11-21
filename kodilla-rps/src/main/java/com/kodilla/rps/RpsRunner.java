package com.kodilla.rps;

import java.util.Scanner;



public class RpsRunner {


    public static void main(String[] args) {

        //Input input = new Input();
        Game game = new Game();
       // Scanner sc = new Scanner(System.in);


        while(!game.isEnd()){
            game.gameMenu();
            //game.printPlayerName();
            //int option = sc.nextInt();

            //if (option==2){
             //   input.setEnd(true);
            //}

            //game.game(game.inputStringFromKeyboard());


        }




/*       do {
            logic.menu();

         } while(input.inputFromKeyborad()!=2);*/

    }
}
