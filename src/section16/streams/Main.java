package section16.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<String> someBingoNumbers = Arrays.asList(
                "N40", "N36",
                "B12", "B6",
                "G53", "G49", "G60", "G50", "g64",
                "I26", "I17", "I29",
                "071");

        List<String> gNumbers = new ArrayList<>();

        // WITHOUT STREAMS

//        someBingoNumbers.forEach(number -> {
//            if (number.toUpperCase().startsWith("G")) {
//                gNumbers.add(number);
//            }
//        });
//
//        gNumbers.sort((number1, number2) -> number1.compareToIgnoreCase(number2));
//
//        gNumbers.forEach(number -> System.out.println(number));

        // WITH STREAMS

//        someBingoNumbers.stream()
//                .filter(number -> number.toUpperCase().startsWith("G"))
//                .sorted()
//                .forEach(number -> System.out.println(number));

        //

        Stream<String> ioNUmberStream = Stream.of("I26", "I17", "I29", "071");
        Stream<String> inNumberStream = Stream.of("N40", "N36", "I26", "I17", "I29", "071");

        Stream<String> concatStream = Stream.concat(ioNUmberStream, inNumberStream);
        System.out.println(concatStream.distinct().peek(System.out::println).count());

        System.out.println(concatStream
                .distinct()
                .peek(System.out::println)
                .count());
    }
}
