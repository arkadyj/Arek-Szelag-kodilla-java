package homeWork.practise.codingBat.functional1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Doubling {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList());

        System.out.println(doubling(list));


    }

    static public List<Integer> doubling(List<Integer> nums) {

        return nums.stream()
                .map(integer -> integer*2)
                .collect(Collectors.toList());
    }


}




