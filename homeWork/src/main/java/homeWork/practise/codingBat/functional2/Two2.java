package homeWork.practise.codingBat.functional2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Two2 {


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,33));

        System.out.println(two2(list));


    }

    static public List<Integer> two2(List<Integer> nums) {

        return nums.stream()
                .map (t-> t*2)
                .filter(t-> (t%10)!=2)
                .collect(Collectors.toList());
    }


}