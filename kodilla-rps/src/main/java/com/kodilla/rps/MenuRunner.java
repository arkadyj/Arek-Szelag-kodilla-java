package com.kodilla.rps;

import javax.xml.bind.SchemaOutputResolver;
import java.io.IOException;
import java.util.*;

public class MenuRunner {
    Scanner sc = new Scanner(System.in);
    private boolean end = false;
    private int roundNumb = 0;
    private int gameStage = 0;
    private int afterGame = 0;
    private int difficultLevel = 2; // 1- for easy, 2 - for normal, 3 for hard
    private Player player;
    private Rules rules;
    private File file = new File();

    public enum DifficultMenu {
        EASY("1"),
        NORMAL("2"),
        HARD("3");

        private String difLevel;

        DifficultMenu (String difLevel){
            this.difLevel=difLevel;
        }
    }


    //ustawienie stopnia trudności
    public void difficultMenu(int oldDifficultLevel) {
        System.out.println("Press 1 to set difficulty level to easy");
        System.out.println("Press 2 to set difficulty level to normal");
        System.out.println("Press 3 to set difficulty level to hard");

        try {
            difficultLevel = inputIntFromKeyborad();
            if (difficultLevel >= 1 && difficultLevel <= 3) {
                System.out.println("Difficulty level has been changed \n");
            }
        } catch (InputMismatchException e) {
            System.out.println("Difficulty level hasn't been changed. Please enter valid level from 1 to 3\n");

        } finally {
            if (difficultLevel < 1 || difficultLevel > 3) {
                System.out.println("Wrong difficulty level. Difficulty level has been restored\n");
                difficultLevel = oldDifficultLevel;

            }
        }
        inputStringFromKeyboard();
    }

    //rozegraj grę jeszcze raz dla tych samych ustawień
    public void playAgain() {
        legendMenu();
        rules = new Rules();
        try {
            rules.playGame(roundNumb, player.getName(), difficultLevel, recognizeDifficultLevel(), file);
        } catch (WrongDataException e) {
            System.out.println("PlayGame - wrong initialized data");
        }
        afterGame = 1;

    }

    public void changePlayerName() {
        System.out.println("Please enter your name.");
        if (player == null) {
            player = new Player(inputStringFromKeyboard());
            if (player.getName().length() <= 3) {
                System.out.println("Please enter min 3 chars");
                changePlayerName();
            }
        } else {
            player.setName(inputStringFromKeyboard());
            if (player.getName().length() <= 3) {
                System.out.println("Please enter min 3 chars");
                changePlayerName();
            }
        }
    }

    //metoda zwracająca słownie poziom trudności
    public String recognizeDifficultLevel() {

        if (difficultLevel == 1) {
            return "Easy";
        } else if (difficultLevel == 2) {
            return "Normal";
        } else return "Hard";
    }

    //zmiana ilości rund do rozegrania
    public void changeRoundNumber() {
        System.out.println("Please enter number of rounds you want to play ");
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println("Please enter digit 1-99");
        }
        roundNumb = sc.nextInt();
        inputStringFromKeyboard();
    }


    public void firstMenu() {
        System.out.println("Initial menu: ");
        changePlayerName();
        changeRoundNumber();

    }

    public void secondMenu() {

        System.out.println("Player name: " + player.getName() + ", number of round: " + roundNumb + ", difficulty level: " + recognizeDifficultLevel());
        System.out.println("###############################################");
        System.out.println("Menu:");
        System.out.println("Press d to change difficulty level");
        System.out.println("Press p to change player name");
        System.out.println("Press r to print results");
        System.out.println("Press c to clear score file");
        System.out.println("Press t to change number of rounds");
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
        System.out.println("Rock(1) beats scissors(3)");
        System.out.println("Paper(2) beats rock(1)");
        System.out.println("Scissors(3) beats paper(2)");
        System.out.println("Rock(1) beats lizard(4)");
        System.out.println("Lizard(4) beats Spock(5)");
        System.out.println("Spock(5) beats scissors(3)");
        System.out.println("Scissors(3) beats lizard(4)");
        System.out.println("Lizard(4) beats paper(2)");
        System.out.println("Paper(2) beats Spock(5)");
        System.out.println("Spock(5) beats rock(1)");
    }

    //metoda uruchamiana w petli, steruje menu
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

            case " ": {
                playAgain();
                break;
            }
            case "c": {
                file.clearScoreFile();
                gameMenu();
                break;
            }
            case "d": {
                difficultMenu(difficultLevel);
                gameMenu();
                break;
            }
            case "n": {
                playAgain();
                break;
            }
            case "p": {
                changePlayerName();
                gameMenu();
                break;
            }

            case "r": {
                file.readFromFile();
                break;
            }
            case "t": {
                changeRoundNumber();
                break;
            }
            case "x": {
                System.out.println("Are you sure?? Press Y to confirm.");

                if (inputStringFromKeyboard().toUpperCase().equals("Y")) {
                    System.out.println("Exit from game");
                    setEnd(true);
                    sc.close();
                    break;
                } else {
                    gameMenu();
                    break;
                }
            }

            default: {
                System.out.println("Please enter proper key \n");
                break;
            }
        }
    }
}
