package javaTAU.Collections.exercise;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static Map<String, Integer> finalGrades;

    public static void main(String[] args) {

//        finalGrades = new HashMap<>(TestResults.getOriginalGrades());
//        System.out.println(finalGrades);
//
//        for (String key : finalGrades.keySet()) {
//            if (TestResults.getMakeUpGrades().get(key) > finalGrades.get(key)) {
//                finalGrades.replace(key, finalGrades.get(key), TestResults.getMakeUpGrades().get(key));
//            }
//        }

//        finalGrades.forEach((key, value) -> {
//            if (TestResults.getMakeUpGrades().get(key) > value) {
//                finalGrades.replace(key, value, TestResults.getMakeUpGrades().get(key));
//            }
//        });

//        System.out.println(finalGrades);

        Map<String, Integer> originalGrades = TestResults.getOriginalGrades();
        Map<String, Integer> makeUpGrades = TestResults.getMakeUpGrades();
        Map<String, Integer> finalGrades = TestResults.getFinalGrades(originalGrades, makeUpGrades);

        System.out.println("original: " + originalGrades);
        System.out.println("makeup:   " + makeUpGrades);
        System.out.println("final:    " + finalGrades);
    }
}
