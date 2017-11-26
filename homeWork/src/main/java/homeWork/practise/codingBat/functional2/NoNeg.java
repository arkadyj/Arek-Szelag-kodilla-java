package homeWork.practise.codingBat.functional2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NoNeg {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,-20,33));

        System.out.println(rightDigit(list));


    }

    static public List<Integer> rightDigit(List<Integer> nums) {

        return nums.stream()
                .filter(t-> t>=0)
                .collect(Collectors.toList());
    }


}