package com.kodilla.rps;

import java.io.IOException;
import java.util.*;

public class Game {
    Scanner sc = new Scanner(System.in);
    private boolean end = false;
    private int roundNumb=0;
    private int gameStage = 0;
    private int afterGame = 0;
    private int difficultLevel = 2; // 1- for easy, 2 - for normal, 3 for hard
    private Player player;
    private Rules rules;
    private File file;

    //private Input input;
    //Input input = new Input();

    public void difficultMenu(int oldDifficultLevel){
        System.out.println("Press 1 to set difficulty level to easy");
        System.out.println("Press 2 to set difficulty level to normal");
        System.out.println("Press 3 to set difficulty level to hard");

        try {
            difficultLevel=inputIntFromKeyborad();
            if (difficultLevel>=1 && difficultLevel<=3) {
                System.out.println("Difficulty level has been changed \n");
            }
        } catch (InputMismatchException e) {
            System.out.println("Difficulty level hasn't been changed. Please enter valid level from 1 to 3\n");

        } finally {
            if (difficultLevel<1 || difficultLevel>3){
                System.out.println("Wrong difficulty level. Difficulty level has been restored\n");
                difficultLevel=oldDifficultLevel;

            }
        }
        inputStringFromKeyboard();
    }

    public String recognizeDifficultLevel(){

        if (difficultLevel==1){
            return "Easy";
        }
        else if (difficultLevel==2) {
            return "Normal";
        }
        else return "Hard";
    }


    public void firstMenu() {
        System.out.println("Initial menu: ");
        System.out.println("Please enter your name.");
        player = new Player(inputStringFromKeyboard());
        System.out.println("Please enter number of rounds you want to play ");

        while (!sc.hasNextInt()){
            sc.next();
            System.out.println("Please enter digit 1-99");
        }
        roundNumb=sc.nextInt();

        inputStringFromKeyboard();
    }

    public void secondMenu() {
        System.out.println("Menu:");
        System.out.println("Press d to change difficulty level");
        System.out.println("Press p to print results");
        System.out.println("Press x to exit the game");
        if (afterGame == 1) {
            System.out.println("Press n to play again");
        }
        if (gameStage == 1 && afterGame == 0) {
            System.out.println("Press spacebar to play the game\n");
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
                System.out.println("Are you sure?? Press Y to confirm.");

                if (inputStringFromKeyboard().toUpperCase().equals("Y")) {
                    System.out.println("Exit from game");
                    setEnd(true);
                    sc.close();
                    break;
                }
                else {
                    gameMenu();
                    break;
                }
            }
            case " ": {
                legendMenu();
                rules = new Rules();
                try {
                    rules.playGame(roundNumb, player.getName(), difficultLevel, recognizeDifficultLevel());
                }catch (WrongDataException e){
                    System.out.println("PlayGame - wrong initialized data");
                }

                afterGame = 1;
                break;
            }
            case "n": {
                gameStage = 0;
                afterGame = 0;
                gameMenu();
                break;
            }

            case "p": {
                file = new File();
                file.readFromFile();
                break;
            }

            case "d": {
                difficultMenu(difficultLevel);
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
