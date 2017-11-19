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

    Set<String> winCondition = new HashSet<>();
    Set<String> loseCondition = new HashSet<>();



    public void winChoices(){
        winCondition.add("2-1");
        winCondition.add("3-2");
        winCondition.add("1-3");
    }

    public void loseChoices(){
        loseCondition.add("1-2");
        loseCondition.add("2-3");
        loseCondition.add("3-1");
    }


    public void playGame (int roundsNumber, String name) {
        int round=1;
        winChoices();
        loseChoices();

        while(humanWin<roundsNumber && computerWin<roundsNumber){
            System.out.println("Round "+round);
            choiceWhoWin(playerMove(),computerMove());
            round++;
        }





        System.out.println("ilosc rund: "+ roundsNumber+ " imie gracza: "+ name);
    }

    public int playerMove(){

        System.out.println("Please choose: 1 - rock, 2 - paper or 3 - scissors");
        return sc.nextInt();
    }
    public int computerMove(){
        return rand.nextInt(2)+1;
    }

    public void choiceWhoWin(int human, int computer){

        String comparision = human+"-"+computer;

        if (winCondition.contains(comparision)) {
            System.out.println("Player win: "+comparision);
            humanWin++;
        }
        else if (loseCondition.contains(comparision)) {
            System.out.println("Computer win: "+ comparision);
            computerWin++;
        }
        else {
            System.out.println("Tie "+comparision);
        }

    }

}
