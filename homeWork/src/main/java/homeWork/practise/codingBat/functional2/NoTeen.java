package homeWork.practise.codingBat.functional2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NoTeen {


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(11,13,19,33));

        System.out.println(noTeen(list));


    }

    static public List<Integer> noTeen(List<Integer> nums) {

        return nums.stream()
                .filter(t-> t<13 || t>19)
                .collect(Collectors.toList());
    }


}