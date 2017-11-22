package com.kodilla.rps;

import java.util.*;

public class Game {
    Scanner sc = new Scanner(System.in);
    private boolean end = false;
    private int roundNumb;
    private int gameStage = 0;
    private int afterGame = 0;
    private int difficultLevel = 1; // 0- for easy, 1 - for normal, 2 for hard
    private Player player;
    private Rules rules;

    //private Input input;
    //Input input = new Input();

    public void difficultMenu(){
        System.out.println("Press 0 to set difficulty level to easy");
        System.out.println("Press 1 to set difficulty level to normal");
        System.out.println("Press 2 to set difficulty level to hard");
        difficultLevel=inputIntFromKeyborad();
        inputStringFromKeyboard();
    }

    public String recognizeDifficultLevel(){

        if (difficultLevel==0){
            return "Easy";
        }
        else if (difficultLevel==1) {
            return "Normal";
        }
        else return "Hard";
    }


    public void firstMenu() {
        System.out.println("Initial menu: ");
        System.out.println("Please enter your name.");
        player = new Player(inputStringFromKeyboard());
        System.out.println("Please enter number round");
        roundNumb = inputIntFromKeyborad();
        inputStringFromKeyboard();
    }

    public void secondMenu() {
        System.out.println("Menu:");
        System.out.println("Press d to change difficulty level");
        System.out.println("Press x to exit the game");
        if (afterGame == 1) {
            System.out.println("Press n to play again");
        }
        if (gameStage == 1 && afterGame == 0) {
            System.out.println("Press space to play the game\n");
        } else {
            System.out.println("\n");
        }
    }

    public void legendMenu() {

        System.out.println("\nIn game rules: ");
        System.out.println("Rock beats scissors");
        System.out.println("Paper beats rock");
        System.out.println("Scissors beats paper");
        System.out.println("Rock beats lizard");
        System.out.println("Lizard beats Spock");
        System.out.println("Spock beats scissors");
        System.out.println("Scissors beats lizard");
        System.out.println("Lizard beats paper");
        System.out.println("Paper beats Spock");
        System.out.println("Spock beats rock");
    }


    public void gameMenu() {
        if (gameStage == 0) {
            firstMenu();
            gameStage = 1;
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

    public int inputIntFromKeyborad() {
        return sc.nextInt();
    }

    public String inputStringFromKeyboard() {
        return sc.nextLine();
    }

    public void game(String option) {

        switch (option) {
            case "x": {
                System.out.println("Are you sure?? Y/N");

                if (inputStringFromKeyboard().equals("N")) {
                    gameMenu();
                    break;
                } else {
                    System.out.println("Exit from the game");
                    setEnd(true);
                    sc.close();
                    break;
                }
            }
            case " ": {
                legendMenu();
                rules = new Rules();
                rules.playGame(roundNumb, player.getName(), difficultLevel, recognizeDifficultLevel());
                afterGame = 1;
                break;
            }
            case "n": {
                gameStage = 0;
                afterGame = 0;
                gameMenu();
                break;
            }

            case "d": {
                difficultMenu();
                gameMenu();
                break;
            }

            default: {
                System.out.println("Please enter proper key \n\n");
                break;
            }
        }
    }
}
