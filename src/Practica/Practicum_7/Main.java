package Practica.Practicum_7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StringProcessor processor = new StringProcessor();
        ArrayList<String> woorden = new ArrayList<>();
        woorden.add("student");
        woorden.add("stageplek");
        processor.voegProcesToe(new CensureerProces(woorden));

        processor.voegProcesToe(new VervangProces("hij", "hij/zij"));
        processor.voegProcesToe(new HoofdletterProces());

        String inputString = "Een student loopt meestal in het derde jaar stage. Dan moet hij zelf een stageplek vinden.";
        String result = processor.verwerk(inputString);
        System.out.println(result);
    }
}
