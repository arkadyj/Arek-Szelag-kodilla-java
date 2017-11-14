package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void decorate (String sourceText, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(sourceText);
        System.out.println(result);

    }
}
