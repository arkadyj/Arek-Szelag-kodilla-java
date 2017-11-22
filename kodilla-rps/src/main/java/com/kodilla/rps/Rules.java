package com.kodilla.rps;

import java.util.*;

public class Rules  {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    private Set<Integer> gameChoose = new HashSet<>();



    int humanWin=0;
    int computerWin=0;

    //Set<String> winCondition = new HashSet<>();
    //Set<String> loseCondition = new HashSet<>();

    Set<GameCondition> winCondition = new HashSet<>();
    Set<GameCondition> loseCondition = new HashSet<>();


    public void fillSet(){
        gameChoose.add(1);
        gameChoose.add(2);
    }




    public void winChoices(){
        winCondition.add(new GameCondition("2-1"));
        winCondition.add(new GameCondition("3-2"));
        winCondition.add(new GameCondition("1-3"));
        winCondition.add(new GameCondition("1-4"));
        winCondition.add(new GameCondition("4-5"));
        winCondition.add(new GameCondition("5-3"));
        winCondition.add(new GameCondition("3-4"));
        winCondition.add(new GameCondition("4-2"));
        winCondition.add(new GameCondition("2-5"));
        winCondition.add(new GameCondition("5-1"));
    }

    public void loseChoices(){
        loseCondition.add(new GameCondition("1-2"));
        loseCondition.add(new GameCondition("2-3"));
        loseCondition.add(new GameCondition("3-1"));
        loseCondition.add(new GameCondition("1-4"));
        loseCondition.add(new GameCondition("5-4"));
        loseCondition.add(new GameCondition("3-5"));
        loseCondition.add(new GameCondition("4-3"));
        loseCondition.add(new GameCondition("2-4"));
        loseCondition.add(new GameCondition("5-2"));
        loseCondition.add(new GameCondition("1-5"));
    }


    public void playGame (int roundsNumber, String name) {
        int round=1;
        winChoices();
        loseChoices();

        while(humanWin<roundsNumber && computerWin<roundsNumber){
            System.out.println("\nRound "+round);
            choiceWhoWin(playerMove(),computerMove());

            round++;
        }

        System.out.println("\n#########END OF GAME ###################");
        if (humanWin > computerWin){
            System.out.println(name+" win the game: "+humanWin+ " to "+ computerWin);

        }
        else  {
            System.out.println("Computer win the game: "+ computerWin+ " to "+ humanWin);
        }
        System.out.println("#########END OF GAME ###################\n");





        //System.out.println("ilosc rund: "+ roundsNumber+ " wygrane: "+ humanWin + " "+ computerWin);
    }

    public int playerMove(){


        System.out.println("Please choose: 1 - rock, 2 - paper, 3 - scissors, 4- lizard, 5 - Spock");

        int result=0;

        if (sc.hasNextInt()) {
            result=sc.nextInt();
        }


        /*do {
             result = sc.nextInt();
            if (result<1 && result>5 ) {
                System.out.println("Please enter valid key");
            }

        }while (result<1 && result>5 ); */

        return result;



    }
    public int computerMove(){
        Integer result = Collections.shuffle(gameChoose);
        return rand.nextInt(5)+1;
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
            System.out.println("\nTie "+comparision);
        }
        System.out.println("Score game: Player - computer");
        System.out.println(humanWin+" - "+computerWin+"\n");

    }

}
