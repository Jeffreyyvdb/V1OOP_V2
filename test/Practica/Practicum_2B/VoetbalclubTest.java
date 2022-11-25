package Practica.Practicum_2B;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VoetbalclubTest {

    private Voetbalclub standaardVoetbalClub;

    @BeforeEach
    void init(){
        standaardVoetbalClub = new Voetbalclub("Ajax");
    }
    @Test
    void verwerkResultaat_FoutieveInvoer_BeinvloedPuntensaldoNiet(){
        standaardVoetbalClub.verwerkResultaat('x');
        assertEquals(0,standaardVoetbalClub.aantalPunten());
    }

    @Test
    void setNaam_AlsNaamIsEmptyString_NaamIsFC(){
        Voetbalclub voetbalclub = new Voetbalclub("");
        assertEquals("FC", voetbalclub.getNaam());
    }

    @Test
    void verwerkResultaat_VerwerktWinst_Levert3puntenOp(){
        standaardVoetbalClub.verwerkResultaat('w');
        assertEquals(3, standaardVoetbalClub.aantalPunten());
    }

    @Test
    void verwerkResultaat_VerwerkGelijkspel_Levert1puntOp(){
        standaardVoetbalClub.verwerkResultaat('w');
        assertEquals(3, standaardVoetbalClub.aantalPunten());
    }

    @Test
    void verwerkResultaat_VerwerkVerlies_levertGeenPuntenOp(){
        standaardVoetbalClub.verwerkResultaat('v');
        assertEquals(0,standaardVoetbalClub.aantalPunten());
    }

    @Test
    void verwerkResultaat_VerwerkWinst_IsZichtbaarInStringRepresentatie(){
        standaardVoetbalClub.verwerkResultaat('w');
        assertEquals("Ajax 1 1 0 0 3",standaardVoetbalClub.toString() );
    }

    @Test
    void verwerkResultaat_VerwerkGelijkspel_IsZichtbaarInStringRepresentatie(){
        standaardVoetbalClub.verwerkResultaat('g');
        assertEquals("Ajax 1 0 1 0 1",standaardVoetbalClub.toString() );
    }

    @Test
    void verwerkResultaat_VerwerkVerlies_IsZichtbaarInStringRepresentatie(){
        standaardVoetbalClub.verwerkResultaat('v');
        assertEquals("Ajax 1 0 0 1 0",standaardVoetbalClub.toString() );
    }

    @Test
    void verwerkResultaat_HerhaaldelijkVerwerken_GeeftCorrectOptellingVanPunten(){
        standaardVoetbalClub.verwerkResultaat('w');
        standaardVoetbalClub.verwerkResultaat('w');
        standaardVoetbalClub.verwerkResultaat('g');
        standaardVoetbalClub.verwerkResultaat('g');
        assertEquals(8, standaardVoetbalClub.aantalPunten());
    }

    @Test
    void verwerkResultaat_HerhaaldelijkVerwerken_GeeftCorrectOptellingVanWedstrijden(){
        standaardVoetbalClub.verwerkResultaat('w');
        standaardVoetbalClub.verwerkResultaat('w');
        standaardVoetbalClub.verwerkResultaat('g');
        standaardVoetbalClub.verwerkResultaat('g');
        assertEquals(4, standaardVoetbalClub.aantalGespeeld());
    }

}
