package homeWork.practise.project_patterns.strategy;

public class StringCreator {

    private NamingStrategy namingStrategy;

    public StringCreator(NamingStrategy namingStrategy) {
        this.namingStrategy = namingStrategy;
    }

    public void printString(String str1, String str2) {
        System.out.println(namingStrategy.rename(str2,str1));
    }

    /** Alternative to pass strategy as method parameter */
    public static void printString(String str1, String str2, NamingStrategy strategy) {
        System.out.println(strategy.rename(str1, str2));
    }

    public void setNamingStrategy(NamingStrategy namingStrategy) {
        this.namingStrategy = namingStrategy;
    }
}
