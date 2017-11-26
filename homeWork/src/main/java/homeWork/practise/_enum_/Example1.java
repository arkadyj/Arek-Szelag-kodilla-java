package homeWork.practise._enum_;

public class Example1 {


    public enum DifficultLevel {
        EASY("1"),
        NORMAL("2"),
        HARD("3");

        private String level;

        DifficultLevel (String level){
            this.level=level;
        }
    }

    public static void main(String[] args) {

        DifficultLevel difficultLevel = DifficultLevel.EASY;

        System.out.println("Poziom Easy: "+difficultLevel.level);

    }


}
