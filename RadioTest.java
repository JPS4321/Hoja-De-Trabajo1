import org.junit.Test;
import static org.junit.Assert.*;

public class RadioTest {
    @Test
    public void pruebaFM() {
        Radio radio = new Radio();  //Nuevo objeto radio
        radio.setFMActualStation(100.61+0.01); //suma
        double result = radio.getFMActualStation();
        assertEquals(100.62, result,0); //confirmar la suma
    }

    @Test
    public void pruebaAM() {
        Radio radio = new Radio();  //Nuevo objeto radio
        radio.setAMActualStation(600+1);  //suma
        int result = radio.getAMActualStation();
        assertEquals(601, result,0); //confirmar la suma
    }

    @Test
    public void PruebaAM2() {
        Radio radio = new Radio();  //Nuevo objeto radio
        radio.setAMActualStation(1610+9);  //suma
        int result = radio.getAMActualStation();
        assertEquals(1619, result,0); //confirmar la suma
    }
}