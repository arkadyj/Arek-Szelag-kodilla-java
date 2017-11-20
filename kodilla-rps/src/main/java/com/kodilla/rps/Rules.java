package com.kodilla.rps;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Rules  {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    int humanWin=0;
    int computerWin=0;

    //Set<String> winCondition = new HashSet<>();
    //Set<String> loseCondition = new HashSet<>();

    Set<GameCondition> winCondition = new HashSet<>();
    Set<GameCondition> loseCondition = new HashSet<>();




    public void winChoices(){
        winCondition.add(new GameCondition("2-1"));
        winCondition.add(new GameCondition("3-2"));
        winCondition.add(new GameCondition("1-3"));
    }

    public void loseChoices(){
        loseCondition.add(new GameCondition("1-2"));
        loseCondition.add(new GameCondition("2-3"));
        loseCondition.add(new GameCondition("3-1"));
    }


    public void playGame (int roundsNumber, String name) {
        int round=1;
        winChoices();
        loseChoices();

        while(humanWin<roundsNumber && computerWin<roundsNumber){
            System.out.println("Round "+round);
            choiceWhoWin(playerMove(),computerMove());
            System.out.println(humanWin+" "+computerWin);
            round++;
        }

        if (humanWin > computerWin){
            System.out.println("\n############################");
            System.out.println(name+" win the game: "+humanWin+ " to "+ computerWin+"\n");
            System.out.println("\n############################");
        }
        else  {
            System.out.println("\nComputer win the game: "+ computerWin+ " to "+ humanWin+"\n");
        }





        //System.out.println("ilosc rund: "+ roundsNumber+ " wygrane: "+ humanWin + " "+ computerWin);
    }

    public int playerMove(){

        System.out.println("Please choose: 1 - rock, 2 - paper or 3 - scissors");
        return sc.nextInt();
    }
    public int computerMove(){
        return rand.nextInt(3)+1;
    }

    public void choiceWhoWin(int human, int computer){

        GameCondition comparision = new GameCondition(human+"-"+computer);

        if (winCondition.contains(comparision)) {
            System.out.println("\nPlayer win: "+comparision+"\n");
            humanWin++;
        }
        else if (loseCondition.contains(comparision)) {
            System.out.println("\nComputer win: "+ comparision+"\n");
            computerWin++;
        }
        else {
            System.out.println("\nTie "+comparision+"\n");
        }

    }

}
