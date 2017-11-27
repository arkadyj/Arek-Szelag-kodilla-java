package homeWork.practise.codingBat.functional2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NoYY {


    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList(""));

        System.out.println(noYY(list));


    }

    static public List<String> noYY(List<String> strings) {

        return strings.stream()
                .map(s -> s+"y")
                .filter(s-> !s.contains("yy"))
                .collect(Collectors.toList());

    }


}