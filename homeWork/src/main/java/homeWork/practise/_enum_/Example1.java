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

        public String getLevel(){
            return level;
        }
    }

    public static String difficultRecognizer(int level){


        String stringLevel = Integer.toString(level);
        System.out.println(stringLevel);

        System.out.println(DifficultLevel.valueOf("1"));

        return "aaa";
    }

    public static void main(String[] args) {

        DifficultLevel difficultLevel = DifficultLevel.EASY;

        //System.out.println("Poziom: "+difficultLevel);

        difficultRecognizer(1);

    }




}
