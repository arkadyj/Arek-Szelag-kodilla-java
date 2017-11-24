package com.kodilla.rps;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class File {

    //zapis wyniku do pliku
    //zastanawiałem się czy nie zapisywać pliku do katalogu temp użytkownika, ale zdecydowałe się na to
    //w pewnym momencie chciałem zastosować plik z parametrami, do którego użytkownik zapisywałby ścieżkę
    //do pliku z wynikami ale na razie zrezygnowałem z tego
    public void writeToFile(String name, String difficultyLevel, int humanWin, int computerWin) {

        DateTimeFormatter dataTimeFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        try {
            java.io.File scoreFile = new java.io.File("./kodilla-rps/src/main/resources/File/gameScore.txt");
            scoreFile.createNewFile();
            FileOutputStream oFile = new FileOutputStream(scoreFile, true);
            DataOutputStream outStream = new DataOutputStream(new BufferedOutputStream(oFile));
            String toWrite = "Game : " + LocalDateTime.now().format(dataTimeFormat) + ",  player: " + name + ",  difficulty level: " +
                    difficultyLevel + "|| Game result: human - computer: " + humanWin + " - " + computerWin;
            outStream.writeBytes(toWrite);
            outStream.writeBytes(System.getProperty("line.separator"));
            outStream.close();
        } catch (IOException e) {
            System.out.println("Can't open/create file!! " + e);
        } finally {

        }
    }

    public void readFromFile() {

        System.out.println("#######################PRINTIG SCORE RESULT#########################");
        try {
            InputStream in = new FileInputStream(new java.io.File("./kodilla-rps/src/main/resources/File/gameScore.txt"));
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            StringBuilder out = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                out.append(line);
                out.append("\n");
            }
            System.out.println(out.toString());   //Prints the string content read from input stream
            reader.close();
        } catch (IOException e) {
            System.out.println("Can't read from file!! " + e);
        } finally {
            System.out.println("\n");
        }
    }

    public void clearScoreFile() {

        try {
            java.io.File scoreFile = new java.io.File("./kodilla-rps/src/main/resources/File/gameScore.txt");
            scoreFile.createNewFile();
            FileOutputStream oFile = new FileOutputStream(scoreFile, false);
            DataOutputStream outStream = new DataOutputStream(new BufferedOutputStream(oFile));
            outStream.writeBytes("");
            outStream.close();
        } catch (IOException e) {
            System.out.println("Can't open/create file!! " + e);
        } finally {

        }
    }
}
