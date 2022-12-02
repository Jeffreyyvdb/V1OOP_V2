package Practica.Practicum_4B;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//setNaam_AlsNaamIsEmptyString_NaamIsFC
public class AutoHuurTest {

    Klant klant;
    Auto auto;
    AutoHuur autoHuur;

    @BeforeEach
    public void init(){
        klant = new Klant("Jeffrey");
        auto = new Auto("Opel", 0);
        autoHuur = new AutoHuur();

        autoHuur.setHuurder(klant);
        autoHuur.setGehuurdeAuto(auto);
    }

    @Test
    public void totaalPrijs_3DagenPrijsIs10zonderKorting_GeeftJuistePrijs(){
        //Arrange
        klant.setKorting(0);
        autoHuur.setAantalDagen(3);
        auto.setPrijsPerDag(10);
        //Act
        double actual = autoHuur.TotaalPrijs();
        double expected = 3 * 10;
        //Assert
        assertEquals(expected,actual);
    }

    @Test
    public void totaalPrijs_3Dagen10euroPerDagMet10ProcentKorting_GeeftJuistePrijs(){
        //Arrange
        klant.setKorting(10);
        autoHuur.setAantalDagen(3);
        auto.setPrijsPerDag(10);
        //Act
        double actual = autoHuur.TotaalPrijs();
        double expected = 3 * 10 * 0.9;
        //Assert
        assertEquals(expected,actual);
    }

    @Test
    public void toString_KlantZonderKorting_wordtOpJuisteManierWeergegevenInString(){
        //Arrange
        klant.setKorting(0);
        auto.setPrijsPerDag(10);
        autoHuur.setAantalDagen(3);
        //Act
        String actual = autoHuur.toString();
        String expected = "autotype : Opel met prijs per dag: 10.0\n"
                + "op naam van : Jeffrey (korting: 0.0%)\n"
                + "aantal dagen: 3 en dat kost: 30.0";

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void toString_KlantMet10ProcentKorting_wordtOpJuisteManierWeergegevenInString(){
        //Arrange
        klant.setKorting(10);
        auto.setPrijsPerDag(10);
        autoHuur.setAantalDagen(3);
        //Act
        String actual = autoHuur.toString();
        String expected = "autotype : Opel met prijs per dag: 10.0\n"
                + "op naam van : Jeffrey (korting: 10.0%)\n"
                + "aantal dagen: 3 en dat kost: 27.0";

        //Assert
        assertEquals(expected, actual);
    }
}
