package Practica.Practicum_11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        // src/Practica/Practicum_11/Artikelen.txt

        // ask and get the source file
        Path sourcePath = getSourcePath();

        // get the lines
        List<String> lines = Files.readAllLines(sourcePath);
        List<Artikel> artikelen = new ArrayList<Artikel>();

        // convert to list of Artikelen
        for (String line : lines) {
            artikelen.add(Artikel.convertString(line));
        }

        // get the rate
        double rate = getDollarToEuroRate();
        System.out.println("Opgegeven koers : " + rate);


        // ask for destination path
        Path destinationBestandPath = getDestinationPath();

        // write to destination file
        File file = destinationBestandPath.toFile();
        FileWriter fileWriter = new FileWriter(file);

        // and convert price
        for (Artikel artikel : artikelen) {
            artikel.setPrijs(artikel.getPrijs() * rate);
            fileWriter.write(artikel.toString());
        }
        fileWriter.close();
    }

    private static Path getDestinationPath() {
        Boolean correctSourceFileSubmitted = false;
        Path path = null;

        while (!correctSourceFileSubmitted) {
            System.out.print("Bestemmingsbestand : ");

            Scanner keyboardScanner = new Scanner(System.in);
            String bestandsnaam = keyboardScanner.nextLine();
            System.out.println("Bestemmingsbestand: " + bestandsnaam);

            try {
                path = Path.of(bestandsnaam);
                correctSourceFileSubmitted = true;
            } catch (InvalidPathException exception) {
                System.out.println("Ongeldige path opgegeven, probeer opnieuw");
            }
        }
        return path;
    }

    private static double getDollarToEuroRate() {
        Boolean correctRateSubmited = false;
        double rate = 0;

        while (!correctRateSubmited) {
            System.out.print("Dollar > Euro koers : ");

            Scanner keyboardScanner = new Scanner(System.in);
            String inputRate = keyboardScanner.nextLine();

            try {
                rate = Double.parseDouble(inputRate);
                correctRateSubmited = true;
            } catch (Exception exception) {
                System.out.println("Ongeldige koers opgegeven, probeer opnieuw");
            }
        }

        return rate;
    }

    public static Path getSourcePath() {
        Boolean correctSourceFileSubmitted = false;
        Path path = null;

        while (!correctSourceFileSubmitted) {
            System.out.print("Bronbestand: ");

            Scanner keyboardScanner = new Scanner(System.in);
            String bestandsnaam = keyboardScanner.nextLine();
            System.out.println("Bron: " + bestandsnaam);

            try {
                path = Path.of(bestandsnaam);
                correctSourceFileSubmitted = true;
            } catch (InvalidPathException exception) {
                System.out.println("Ongeldige path opgegeven, probeer opnieuw");
            }
        }
        return path;
    }
}
