import org.junit.Test;
import static org.junit.Assert.*;

public class RadioTest {
    @Test
    public void pruebaFM() {
        Radio radio = new Radio();  //Nuevo objeto radio
        radio.setFrequency("FM"); //Aquí la función para obtener la frecuencia.
        String result = radio.tune(100.5, 2); //suma
        assertEquals("100.7", result); //confirmar la suma
    }

    @Test
    public void pruebaAM() {
        Radio radio = new Radio();  //Nuevo objeto radio
        radio.setFrequency("AM"); //Aquí la función para obtener la frecuencia.
        String result = radio.tune(600, 1);  //suma
        assertEquals("601", result); //confirmar la suma
    }

    @Test
    public void LimiteAM() {
        Radio radio = new Radio(); //Nueva radio
        radio.setFrequency("AM"); //Set Frecuencia
        String result = radio.tune(1610, 9); //Suma
        assertEquals("1610", result); //confirmar
    }
}