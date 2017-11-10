package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {

    //dlaczego zwracasz list? operujesz na generykach wiec uzywaj nawiasów<>,później gorzej się wyciąga z takiej listy bo nie wiadomo jaki typ siedzi w środku
    public ArrayList<Integer>  exterminate(List<Integer> numbers) {

        //po co sprawdzasz typ? jakby nie było listą to byś otrzymał błąd na etapie kompilacji. Nawet IntelliJ podpowiada że to bez sensu
        ArrayList<Integer> returnList = new ArrayList<>();

        if (numbers !=null && numbers.size()!=0) {
            for (Iterator<Integer> list = numbers.iterator(); list.hasNext(); ) {
                Integer entry = list.next();
                if (entry % 2 == 0) {
                    returnList.add(entry);
                }
            }
        } //generalnie typ zwracany to powinien być nowo utworzonym obiektem, a w Twoim przypadku input i output sa połączone referencją, a to nie jest dobre
        return returnList;
    }

}
