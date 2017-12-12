package homeWork.practise.project_patterns.strategy;

public class Main {

    public static void main(String[] args) {

        StringCreator stringCreator = new StringCreator(new PrefixNamingStrategy());
        stringCreator.printString("Tekst ", "This is prefix");

        stringCreator.setNamingStrategy(new SufixNamingStrategy());
        stringCreator.printString(" Test","This is sufix");

        StringCreator.printString(" Example", "Test",new SufixNamingStrategy());


    }
}
