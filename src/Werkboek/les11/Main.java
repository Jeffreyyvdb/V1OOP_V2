package Werkboek.les11;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("src/Werkboek/les11/invoer.txt");
        File file = path.toFile();

        List<String> lines = Files.readAllLines(path);

        double total = 0;
        for (String line: lines) {
            double number = Double.parseDouble(line);
            total += number;
        }

        double gemiddelde = total / lines.size();
        System.out.println(String.format("gemiddelde : %s", gemiddelde));

    }
}
