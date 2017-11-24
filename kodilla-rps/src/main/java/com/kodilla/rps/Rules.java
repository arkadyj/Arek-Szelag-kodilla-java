package com.kodilla.rps;

import java.util.*;

public class Rules {

    Random rand = new Random();
    int humanWin = 0;
    int computerWin = 0;

    Set<GameCondition> winCondition = new HashSet<>();
    Set<GameCondition> loseCondition = new HashSet<>();

    //możliwe zwycięskie kombinacje dla gracza
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

    //możliwe przegrane kombinacje dla gracza
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

    //metoda sterująca rozgrywką
    public void playGame(int roundsNumber, String name, int difficultLevel, String stringDifficultLevel, File file) throws WrongDataException {
        int round = 1;
        winChoices();
        loseChoices();
        //testowy wyjątek powiadamiająca programistę gdyby któreś argumenty były źle ustawione - do oceny przez Ciebie
        if (roundsNumber < 0 || name == null || difficultLevel < 1 || difficultLevel > 4)
            throw new WrongDataException("PlayGame - wrong initialized data");

        while (humanWin < roundsNumber && computerWin < roundsNumber) {
            System.out.println("\nRound: " + round + ". Difficult level: " + stringDifficultLevel);
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

        file.writeToFile(name, stringDifficultLevel, computerWin, humanWin);
    }

    //ruch ze strony graca
    public int playerMove() {

        System.out.println("Please choose: 1 - rock, 2 - paper, 3 - scissors, 4- lizard, 5 - Spock");
        Scanner sc = new Scanner(System.in);
        int result = 0;

        try {
            result = sc.nextInt();

        } catch (InputMismatchException e) {
            result = Integer.MAX_VALUE;

        } finally {
            return result;
        }
    }

    //metoda stetująca wyborem komputera, w przypadku poziomu trudności normal, komputer losuje wartość z pełnej listy
    //gdy poziom trudnośći ustawiony jest na easy - z listy usuwana jest jedna wartość, która daje komputerowi zwycięstwo
    //w przypadku poziomu trudny - usuwana jest wartość dająca graczowi zwycięstwo
    public Integer computerMove(int difficultLevel, int playerMove) {
        List<Integer> possibleElementsChooseList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        String stringPlayerMove = Integer.toString(playerMove);

        if (playerMove >= 1 && playerMove <= 5) {
            switch (difficultLevel) {
                case 3: {
                    String condition = winCondition.stream()
                            .map(set -> set.getCondition())
                            .filter(s -> s.substring(0, 1).equals(stringPlayerMove))
                            .findFirst()
                            .map(s -> s.substring(2, 3))
                            .get();
                    Integer valueToRemove = Integer.parseInt(condition);
                    possibleElementsChooseList.remove(valueToRemove);
                    break;
                }
                case 1: {
                    String condition = loseCondition.stream()
                            .map(set -> set.getCondition())
                            .filter(s -> s.substring(0, 1).equals(stringPlayerMove))
                            .findFirst()
                            .map(s -> s.substring(2, 3))
                            .get();
                    Integer valueToRemove = Integer.parseInt(condition);
                    possibleElementsChooseList.remove(valueToRemove);
                    break;
                }
            }
        }
        //System.out.println(gameChooseList);
        return possibleElementsChooseList.get(rand.nextInt(possibleElementsChooseList.size()));
    }

    // metoda spradzająca kto wygrał
    public void choiceWhoWin(int humanChoice, int computerChoice) {

        GameCondition comparision = new GameCondition(humanChoice + "-" + computerChoice);

        if (winCondition.contains(comparision)) {
            System.out.println("\nPLAYER WIN. " + comparision);
            humanWin++;
        } else if (loseCondition.contains(comparision)) {
            System.out.println("\nCOMPUTER WIN. " + comparision);
            computerWin++;
        } else if (humanChoice < 1 || humanChoice > 5) {
            System.out.println("Wrong digit. You should pick digit from 1 to 5");
        } else {
            System.out.println("\nTIE " + comparision);
        }
        System.out.println("Score game: Player - Computer: " + humanWin + "-" + computerWin + "\n");
        //System.out.println(humanWin + " - " + computerWin + "\n");
    }
}
