package section14.inputOutput;

import java.io.FileWriter;
import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException {
//        FileWriter file = null;
//        try {
//            file = new FileWriter("test-try-catch-finally.txt");
//            file.write("test try-catch-finally");
//        } finally {
//            if (file != null) {
//                file.close();
//            }
//        }

        try (FileWriter file = new FileWriter("file-try-with-resources.txt")) {
            file.write("test try-with-resources");
        }
    }
}
