package homeWork.practise.codingBat.functional1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RightDigit {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,20,33));

        System.out.println(rightDigit(list));


    }

    static public List<Integer> rightDigit(List<Integer> nums) {

        return nums.stream()
                .map( integer -> integer%10)
                .collect(Collectors.toList());
    }


}