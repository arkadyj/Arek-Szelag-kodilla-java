package homeWork.practise.codingBat.functional2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Square56 {



    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,4,33));

        System.out.println(square56(list));


    }

    static public List<Integer> square56(List<Integer> nums) {

        return nums.stream()
                .map (t-> (Math.pow(t,2))+10)
                .map(t-> t.intValue())
                .filter(t-> (t%10)!=5 && t%10!=6)
                .collect(Collectors.toList());
    }


}