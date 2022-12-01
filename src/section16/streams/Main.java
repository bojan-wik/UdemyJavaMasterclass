package section16.streams;

import java.util.*;
import java.util.stream.Collectors;
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

        /*
        - wyciągnąć wszystkie numery zaczynające się na 'G'
        - dodać je do listy 'gNumbers'
        - posortować
        - wyprintować
         */

        // BEZ STREAM

//        someBingoNumbers.forEach(number -> {
//            if (number.toUpperCase().startsWith("G")) {
//                gNumbers.add(number);
//            }
//        });
//
//        gNumbers.sort((number1, number2) -> number1.compareToIgnoreCase(number2));
//
//        gNumbers.forEach(number -> System.out.println(number));

        // Z UŻYCIEM STREAM

//        someBingoNumbers.stream()
//                .filter(number -> number.toUpperCase().startsWith("G"))
//                .sorted()
//                .forEach(number -> System.out.println(number));

        // -------------------------------------------------------------------------------------

        // Z UŻYCIEM STREAM i przekazaniem outputu do osobnej listy za pomocą metody collect()

//        List<String> gNumbersSorted = someBingoNumbers
//                .stream()
//                .map(number -> number.toUpperCase())
//                .filter(number -> number.startsWith("G"))
//                .sorted()
//                .collect(Collectors.toList());
//
//        System.out.println(gNumbersSorted);

        // -------------------------------------------------------------------------------------

        Stream<String> ioNUmberStream = Stream.of("I26", "I17", "I29", "071");
        Stream<String> inNumberStream = Stream.of("N40", "N36", "I26", "I17", "I29", "071");

        /*
        - Połączyć oba streamy
        - usunąć duplikaty
        - wyprintować
        - policzyć ilość ostatecznych numerów
         */

        Stream<String> concatStream = Stream.concat(ioNUmberStream, inNumberStream);

//        System.out.println(concatStream
//                .distinct()
//                .peek(System.out::println)
//                .count());

        // collect() - to list

//        List<String> iNumbersSorted = concatStream
//                .filter(number -> number.startsWith("I"))
//                .distinct()
//                .sorted().
//                collect(Collectors.toList());
//
//        System.out.println(iNumbersSorted);

        // collect() - to map

        Map<Character, List<String>> numbersGroupedByLetter = concatStream
                .distinct()
                .collect(Collectors.groupingBy(number -> number.charAt(0)));

        System.out.println(numbersGroupedByLetter);
    }
}
