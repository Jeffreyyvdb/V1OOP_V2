import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import Practica.Practicum_2A.Zwembad;

public class ZwembadTest {

    @Test
    void inhoud_standaardZwembad_berekendJuisteInhoud(){
        //Arrange
        Zwembad zwembad = new Zwembad(10,12,15);
        //Act
        double berekendeInhoud = zwembad.inhoud();
        double actualInhoud = 10 * 12 * 15;

        //Assert
        assertEquals(actualInhoud,berekendeInhoud);
    }
}
