package section12.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        Map<String, String> englishSpanishDict = new HashMap<>();

        englishSpanishDict.put("house", "casa");
        englishSpanishDict.put("cat", "gato");
        englishSpanishDict.put("beer", "wrong spanish word");

        System.out.println(englishSpanishDict.get("beer"));
        englishSpanishDict.put("beer", "cerveza");
        System.out.println(englishSpanishDict.get("beer"));

//        System.out.println(englishSpanishDict.put("homie", "tio"));
//        englishSpanishDict.put("homie", "tio");
//        System.out.println(englishSpanishDict.put("homie", "tio"));

        if (englishSpanishDict.containsKey("homie")) {
            System.out.println("Key 'homie' is already in the map");
        } else {
            englishSpanishDict.put("homie", "tio");
            System.out.println("Key 'homie' added successfully" +
                    "\n==========================================");
        }

        for (String key : englishSpanishDict.keySet()) {
            System.out.println(key + ": " + englishSpanishDict.get(key));
        }
        System.out.println("==========================================");

//        englishSpanishDict.remove("cat");
//        englishSpanishDict.remove("homie", "ese");
//        englishSpanishDict.remove("homie", "tio");

        System.out.println(englishSpanishDict.replace("homie", "ese"));

        for (String key : englishSpanishDict.keySet()) {
            System.out.println(key + ": " + englishSpanishDict.get(key));
        }
        System.out.println("==========================================");
    }
}
