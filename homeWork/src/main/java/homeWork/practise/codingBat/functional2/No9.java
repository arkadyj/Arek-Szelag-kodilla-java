package homeWork.practise.codingBat.functional2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class No9 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(90,19,33));

        System.out.println(no9(list));


    }

    static public List<Integer> no9(List<Integer> nums) {

        return nums.stream()
                .filter(t-> (t%10)!=9)
                .collect(Collectors.toList());
    }


}