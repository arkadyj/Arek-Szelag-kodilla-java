package homeWork.practise.project_patterns.strategy;


public class SufixNamingStrategy implements NamingStrategy {
    @Override
    public String rename(String str1, String str2) {
        if (str2 == null || str2.trim().length() == 0) {
            throw new IllegalArgumentException("Given String cannot be null or empty");
        }
        return str2 +  str1;
    }
}
