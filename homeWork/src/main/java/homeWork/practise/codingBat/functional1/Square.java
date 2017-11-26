package homeWork.practise.codingBat.functional1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Square {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));

        System.out.println(square(list));


    }

    static public List<Integer> square(List<Integer> nums) {

        return nums.stream()
                .map(( integer -> Math.pow(integer, 2)))
                .map(t-> t.intValue())
                .collect(Collectors.toList());
    }


}