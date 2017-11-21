package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderWithoutHandling;

import java.io.IOException;

public class ExceptionModuleRunner {

    public static void main(String[] args) {
        //FileReader fileReader = new FileReader();
        //fileReader.readFile();
        FileReaderWithoutHandling fileReader = new FileReaderWithoutHandling();

        try  {
            fileReader.readFile();

        } catch (IOException e) {
            System.out.println("Problem with reading a file");

        }

    }
}
