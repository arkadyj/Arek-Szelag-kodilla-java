package com.kodilla.rps;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class File {


    public void writeToFile (String name, String difficultyLevel, int humanWin, int computerWin){

        DateTimeFormatter dataTimeFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        try {
            java.io.File scoreFile = new java.io.File(System.getProperty("java.io.tmpdir") +"/score.txt");
            scoreFile.createNewFile();
            FileOutputStream oFile = new FileOutputStream(scoreFile, true);
            DataOutputStream outStream = new DataOutputStream(new BufferedOutputStream(oFile));
            outStream.writeBytes(System.getProperty("line.separator"));
            String toWrite =  "Game : "+ LocalDateTime.now().format(dataTimeFormat) + ",  player: "+name+ ",  difficulty level: "+
                    difficultyLevel+ "|| Game result: human - computer: "+humanWin+ " - "+computerWin;
            outStream.writeBytes(toWrite);
            outStream.close();


        } catch (IOException e) {
            System.out.println("Can't open/create file!! "+e);
        }
        finally {

        }
    }

    public void readFromFile(){


        try {

            InputStream in = new FileInputStream(new java.io.File(System.getProperty("java.io.tmpdir") +"/score.txt"));
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            StringBuilder out = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                out.append(line);
                out.append("\n");
            }
            System.out.println(out.toString());   //Prints the string content read from input stream
            reader.close();
        }catch (IOException e) {
            System.out.println("Can't read from file!! "+e);
        }
    }
}
