package homeWork.practise.codingBat.functional2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NoZ {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("az","bbb","cczccza"));

        System.out.println(noZ(list));


    }

    static public List<String> noZ(List<String> strings) {

        return strings.stream()
                .filter(s-> !s.contains("z"))
                .collect(Collectors.toList());

    }


}