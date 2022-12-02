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
    }

    @Test
    void toString_WelHuurderWelAutoWelKorting_GeeftVerwachteString() {
        //Arrange
        klant.setKorting(10);
        auto.setPrijsPerDag(10);
        autoHuur.setAantalDagen(3);
        autoHuur.setHuurder(klant);
        autoHuur.setGehuurdeAuto(auto);
        //Act
        String actual = autoHuur.toString();
        String expected = "autotype : Opel met prijs per dag: 10.0\n"
                + "op naam van : Jeffrey (korting: 10.0%)\n"
                + "aantal dagen: 3 en dat kost: 27.0";

        //Assert
        assertEquals(expected, actual);
    }
    @Test
    void toString_WelHuurderWelAutoGeenKorting_GeeftVerwachteString() {
        //Arrange
        klant.setKorting(0);
        auto.setPrijsPerDag(10);
        autoHuur.setAantalDagen(3);
        autoHuur.setHuurder(klant);
        autoHuur.setGehuurdeAuto(auto);
        //Act
        String actual = autoHuur.toString();
        String expected = "autotype : Opel met prijs per dag: 10.0\n"
                + "op naam van : Jeffrey (korting: 0.0%)\n"
                + "aantal dagen: 3 en dat kost: 30.0";

        //Assert
        assertEquals(expected, actual);
    }
    @Test
    void toString_WelHuurderGeenAutoWelKorting_GeeftVerwachteString() {
        autoHuur.setHuurder(klant);

        String actual = autoHuur.toString();
        String expected = "er is geen auto bekend\n"
                + "op naam van : Jeffrey (korting: 0.0%)\n"
                + "aantal dagen: 0 en dat kost: 0.0";

        assertEquals(expected, actual);
    }
    @Test
    void toString_GeenHuurderWelAuto_GeeftVerwachteString() {
        //Arrange
        autoHuur.setGehuurdeAuto(auto);
        //Act
        String actual = autoHuur.toString();
        String expected = "autotype : Opel met prijs per dag: 0.0\n"
                + "er is geen huurder bekend\n"
                + "aantal dagen: 0 en dat kost: 0.0";

        //Assert
        assertEquals(expected, actual);
    }
    @Test
    void toString_GeenHuurderGeenAuto_GeeftVerwachteString() {
        //Arrange
        //Act
        String actual = autoHuur.toString();
        String expected = "er is geen auto bekend\n"
                + "er is geen huurder bekend\n"
                + "aantal dagen: 0 en dat kost: 0.0";

        //Assert
        assertEquals(expected, actual);
    }
    @Test
    void totaalPrijs_WelHuurderWelAutoWelKorting_GeeftJuisteTotaalPrijs() {
        //Arrange
        klant.setKorting(10);
        autoHuur.setAantalDagen(3);
        auto.setPrijsPerDag(10);
        autoHuur.setHuurder(klant);
        autoHuur.setGehuurdeAuto(auto);
        //Act
        double actual = autoHuur.TotaalPrijs();
        double expected = 3 * 10 * 0.9;
        //Assert
        assertEquals(expected,actual);
    }
    @Test
    void totaalPrijs_WelHuurderWelAutoGeenKorting_GeeftJuisteTotaalPrijs() {
        //Arrange
        klant.setKorting(0);
        autoHuur.setAantalDagen(3);
        auto.setPrijsPerDag(10);
        autoHuur.setHuurder(klant);
        autoHuur.setGehuurdeAuto(auto);
        //Act
        double actual = autoHuur.TotaalPrijs();
        double expected = 3 * 10;
        //Assert
        assertEquals(expected,actual);
    }
    @Test
    void totaalPrijs_WelHuurderGeenAuto_GeeftJuisteTotaalPrijs() {
        //Arrange
        autoHuur.setAantalDagen(3);
        autoHuur.setHuurder(klant);
        //Act
        double actual = autoHuur.TotaalPrijs();
        double expected = 3 * 0;
        //Assert
        assertEquals(expected,actual);
    }
    @Test
    void totaalPrijs_GeenHuurderWelAuto_GeeftJuisteTotaalPrijs() {
        //Arrange
        autoHuur.setAantalDagen(3);
        auto.setPrijsPerDag(10);
        autoHuur.setGehuurdeAuto(auto);
        //Act
        double actual = autoHuur.TotaalPrijs();
        double expected = 10 * 3;
        //Assert
        assertEquals(expected,actual);
    }
}
