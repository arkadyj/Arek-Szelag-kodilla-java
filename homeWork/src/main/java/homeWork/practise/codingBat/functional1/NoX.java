package homeWork.practise.codingBat.functional1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NoX {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("sx","bxb","ccxcx"));

        System.out.println(noX(list));


    }

    static public List<String> noX(List<String> strings) {

        return strings.stream()
                .map(s -> s.replaceAll("x",""))
                .collect(Collectors.toList());

    }


}