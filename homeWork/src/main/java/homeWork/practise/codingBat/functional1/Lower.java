package homeWork.practise.codingBat.functional1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lower {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Aa","bB","CCC"));

        System.out.println(lower(list));


    }

    static public List<String> lower(List<String> strings) {

        return strings.stream()
                .map(s -> s.toLowerCase())
                .collect(Collectors.toList());

    }


}