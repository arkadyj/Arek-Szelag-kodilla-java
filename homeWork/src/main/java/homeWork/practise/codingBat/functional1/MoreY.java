package homeWork.practise.codingBat.functional1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MoreY {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("a","bb","ccc"));

        System.out.println(moreY(list));


    }

    static public List<String> moreY(List<String> strings) {

        return strings.stream()
                .map(s -> "y"+s+"y")
                .collect(Collectors.toList());

    }


}