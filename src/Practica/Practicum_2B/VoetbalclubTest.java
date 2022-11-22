package Practica.Practicum_2B;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VoetbalclubTest {

    @Test
    void verwerkResultaatFoutieveInvoerBeinvloedPuntensaldoNiet(){
        //Arrange
        Voetbalclub voetbalclub = new Voetbalclub("Ajax");

        //Act
        voetbalclub.verwerkResultaat('x');

        //Assert
        assertEquals(0,voetbalclub.aantalPunten());
    }
}