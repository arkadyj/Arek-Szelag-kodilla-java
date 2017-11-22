package com.kodilla.rps;

import java.util.*;

import static jdk.nashorn.internal.objects.NativeString.substring;

public class Rules {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    int humanWin = 0;
    int computerWin = 0;

    Set<GameCondition> winCondition = new HashSet<>();
    Set<GameCondition> loseCondition = new HashSet<>();


    public void winChoices() {
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

    public void loseChoices() {
        loseCondition.add(new GameCondition("1-2"));
        loseCondition.add(new GameCondition("2-3"));
        loseCondition.add(new GameCondition("3-1"));
        loseCondition.add(new GameCondition("4-1"));
        loseCondition.add(new GameCondition("5-4"));
        loseCondition.add(new GameCondition("3-5"));
        loseCondition.add(new GameCondition("4-3"));
        loseCondition.add(new GameCondition("2-4"));
        loseCondition.add(new GameCondition("5-2"));
        loseCondition.add(new GameCondition("1-5"));
    }


    public void playGame(int roundsNumber, String name, int difficultLevel, String stringDifficultLevel) {
        int round = 1;
        winChoices();
        loseChoices();

        while (humanWin < roundsNumber && computerWin < roundsNumber) {
            System.out.println("\nRound: " + round + ". Difficult level: "+stringDifficultLevel);
            int playerMove = playerMove();
            choiceWhoWin(playerMove, computerMove(difficultLevel, playerMove));

            round++;
        }

        System.out.println("\n#########END OF GAME ###################");
        if (humanWin > computerWin) {
            System.out.println(name + " win the game: " + humanWin + " to " + computerWin);

        } else {
            System.out.println("Computer win the game: " + computerWin + " to " + humanWin);
        }
        System.out.println("#########END OF GAME ###################\n");


    }


    public int playerMove() {


        System.out.println("Please choose: 1 - rock, 2 - paper, 3 - scissors, 4- lizard, 5 - Spock");

        int result = sc.nextInt();
        return result;
    }

    public Integer computerMove(int difficultLevel, int playerMove) {
        List<Integer> gameChooseList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        String stringPlayerMove = Integer.toString(playerMove);

        switch (difficultLevel) {
            case 2: {
                String condition = winCondition.stream()
                        .map(set -> set.getCondition())
                        .filter(s -> s.substring(0, 1).equals(stringPlayerMove))
                        .findFirst()
                        .map(s -> s.substring(2, 3))
                        .get();
                Integer valueToRemove = Integer.parseInt(condition);
                gameChooseList.remove(valueToRemove);
                break;
            }
            case 0: {
                String condition = loseCondition.stream()
                        .map(set -> set.getCondition())
                        .filter(s -> s.substring(0, 1).equals(stringPlayerMove))
                        .findFirst()
                        .map(s -> s.substring(2, 3))
                        .get();
                Integer valueToRemove = Integer.parseInt(condition);
                gameChooseList.remove(valueToRemove);
                break;
            }
        }
        System.out.println(gameChooseList);
        return gameChooseList.get(rand.nextInt(gameChooseList.size()));
    }

    public void choiceWhoWin(int human, int computer) {

        GameCondition comparision = new GameCondition(human + "-" + computer);

        if (winCondition.contains(comparision)) {
            System.out.println("\nPlayer win: " + comparision + "\n");
            humanWin++;
        } else if (loseCondition.contains(comparision)) {
            System.out.println("\nComputer win: " + comparision + "\n");
            computerWin++;
        } else {
            System.out.println("\nTie " + comparision);
        }
        System.out.println("Score game: Player - computer");
        System.out.println(humanWin + " - " + computerWin + "\n");

    }

}
