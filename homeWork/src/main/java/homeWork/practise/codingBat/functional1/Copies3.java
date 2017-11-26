package homeWork.practise.codingBat.functional1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Copies3 {

    public static void main(String[] args) {
    List<String> list = new ArrayList<>(Arrays.asList("a","bb","ccc"));

    System.out.println(addStar(list));


}

    static public List<String> addStar(List<String> strings) {

        return strings.stream()
                .map(s -> {
                    String tempS="";
                    for (int i=0;i<3;i++){
                        tempS +=s;
                    }
                    return tempS;
                })
                .collect(Collectors.toList());

    }


}