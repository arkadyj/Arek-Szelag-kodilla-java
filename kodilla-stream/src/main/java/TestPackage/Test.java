package TestPackage;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//import static java.util.concurrent.TimeUnit.*;
import static java.time.temporal.ChronoUnit.*;

public class Test {
    public static void main(String[] args) {

        List<LocalDate> lista = new ArrayList<>();

        lista.add(LocalDate.now().minusDays(20));
        lista.add(LocalDate.now().minusDays(10));


        System.out.println(lista.size());
        System.out.println(lista);

        lista.stream()
                //.map(localDate -> localDate.getDayOfMonth())
                .map(localDate -> DAYS.between(localDate,LocalDate.now()))
                .forEach(System.out::println);


    }
}
