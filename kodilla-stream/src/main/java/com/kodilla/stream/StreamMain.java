package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

import static java.awt.SystemColor.text;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class StreamMain {
    public static void main(String[] args) {
        /*
        System.out.println("Welcome to module 7 - Stream");

        Processor processor = new Processor();
        //Executor codeToExecute = () -> System.out.println("This is an example text.");

        processor.execute(() -> System.out.println("This is an example text."));

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

       expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
       expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
       expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
       expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
        */

        //ZADANIE 7_1
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.decorate("This sentence needs to be decorated", (text) -> "ABC "+text+" ABC");
        poemBeautifier.decorate("This sentence needs to be decorated", (text) -> toUpperCase(text));
        poemBeautifier.decorate("This sentence needs to be decorated", (text) -> text.replaceAll("\\s+",""));
        poemBeautifier.decorate("This sentence needs to be decorated", (text) -> "This senstence has been printed with lambda expresion help: \""+text+"\"|^|");

    }
}
