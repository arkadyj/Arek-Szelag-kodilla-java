package com.kodilla.stream;


import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

import static java.time.temporal.ChronoUnit.DAYS;


public class StreamMain {
    public static void main(String[] args) {

        Forum forum = new Forum();
        Map<Integer, ForumUser> par = forum.getList().stream()
                .filter(StreamMain::sexCondition)
                .filter(StreamMain::ageCondition)
                .filter(StreamMain::postCountCondition)
                .collect(Collectors.toMap(ForumUser::getUserID, forumUser -> forumUser));

        par.entrySet().stream()
                .map(entry -> entry.getKey() + " " + entry.getValue())
                .forEach(System.out::println);

       /*
        BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);



        */
        /*
        BookDirectory theBookDirectory = new BookDirectory();

        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elements: " + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

        */
        /*        System.out.println("Welcome to module 7 - Stream");

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

        //ZADANIE 7_1
        /*PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.decorate("This sentence needs to be decorated", (text) -> "ABC "+text+" ABC");
        poemBeautifier.decorate("This sentence needs to be decorated", (text) -> toUpperCase(text));
        poemBeautifier.decorate("This sentence needs to be decorated", (text) -> text.replaceAll("\\s+",""));
        poemBeautifier.decorate("This sentence needs to be decorated", (text) -> "This senstence has been printed with lambda expresion help: \""+text+"\"|^|");

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
        People.getList().stream()
                .map(s -> s.toUpperCase())
                //.forEach(System.out::println)
                //.filter(s -> s.length() > 11)
                .filter(s->s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(s->System.out.println(s));  */


    }

    static public boolean sexCondition(ForumUser forumUser) {
        if (forumUser.getSex() == 'M') {
            return true;
        }
        return false;
    }

    static public boolean ageCondition(ForumUser forumUser) {
        if (DAYS.between(forumUser.getBirthDate(), LocalDate.now()) > 7300) {
            return true;
        }
        return false;
    }

    static public boolean postCountCondition(ForumUser forumUser) {
        if (forumUser.getPostCount() >= 1) {
            return true;
        }
        return false;
    }


}
