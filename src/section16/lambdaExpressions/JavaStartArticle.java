package section16.lambdaExpressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JavaStartArticle {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Kasia", "Leon", "Anna", "Wiktor");

        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String name1, String name2) {
                return name1.compareToIgnoreCase(name2);
            }
        });

        Collections.sort(names, (name1, name2) -> name1.compareToIgnoreCase(name2));

        names.forEach(name -> System.out.println(name));
    }
}
