package homeWork.practise.codingBat.functional2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NoLong {


    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("a","bbb","cccca"));

        System.out.println(noLong(list));


    }

    static public List<String> noLong(List<String> strings) {

        return strings.stream()
                .filter(s-> s.length()<4)
                .collect(Collectors.toList());

    }


}