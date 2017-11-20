package com.kodilla.rps;

import java.util.*;

public class Game {
    Scanner sc = new Scanner(System.in);
    private boolean end = false;
    private int roundNumb;
    private int gameStage=0;
    private Player player;
    private Rules rules;


    //private Input input;
    //Input input = new Input();


    public void firstMenu(){
        System.out.println("Initial menu: ");
        System.out.println("Please enter your name.");
        player = new Player(inputStringFromKeyboard());
        System.out.println("Please enter number round");
        roundNumb=inputIntFromKeyborad();
        inputStringFromKeyboard();
    }

    public void secondMenu(){
        System.out.println("Menu:");
        System.out.println("Press x to exit the game");
        System.out.println("Press n to play again");
       if (gameStage==1) {
           System.out.println("Press space to play the game\n");
       }
       else {
           System.out.println("\n");
       }
    }

    public void legendMenu(){
        System.out.println("\nLegend - in game keys: ");
        System.out.println("Press 1 to choose rock");
        System.out.println("press 2 to choose paper");
        System.out.println("Press 3 to choose scissors\n");
    }

    public void exitGame(){

    }

    public void printPlayerName() {
        System.out.println(player.getName());
        System.out.println(roundNumb);
    }



    public void gameMenu() {
        if (gameStage==0){
            firstMenu();
            gameStage=1;
        }
        secondMenu();
        game(inputStringFromKeyboard());
    }

    public boolean isEnd() {
        return end;
    }

    public void setEnd(boolean end) {
        this.end = end;
    }

    public int inputIntFromKeyborad(){
        return sc.nextInt();
    }

    public String inputStringFromKeyboard(){
        return sc.nextLine();
    }

    public void game(String option){

        switch (option) {
            case "x": {
                System.out.println("Are you sure?? Y/N");

                if (inputStringFromKeyboard().equals("N")) {
                    gameMenu();
                    break;
                }
                else {
                    System.out.println("Exit from the game");
                    setEnd(true);
                    sc.close();
                    break;
                }
            }
            case " ": {
                legendMenu();
                rules = new Rules();
                rules.playGame(roundNumb, player.getName());

                break;
            }
            case "n": {
                gameStage=0;
                gameMenu();
            }

            default: {
                System.out.println("Please enter proper key \n\n");
                break;
            }
        }
    }
}
