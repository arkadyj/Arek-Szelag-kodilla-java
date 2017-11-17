package com.kodilla.stream.array;


import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static OptionalDouble getAverage(int[] numbers) {

        if (numbers.length > 0) {

            IntStream.range(0, numbers.length)
                    .map(n -> numbers[n])
                    .forEach(System.out::println);

            return IntStream.range(0, numbers.length)
                    .map(n -> numbers[n])
                    .average();

        } else {
            return OptionalDouble.of(0.0);
        }
    }
}
