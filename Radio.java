//Hoja de Trabajo 1
// Por: Esteban Zambrano, Juan Fernando Menendez y Juan Pablo Solis
public class Radio implements IRadio {
    boolean encendida = false;
    String Frecuencia = "FM";
    double FM = 92;
    int AM = 600;
    int[] ListaAM = new int[13];
    double[] ListaFM = new double[13];
    


    @Override
    //Enciende la radio
    public void on() {
        encendida = true;
    }
    //Apaga la radio
    @Override
    public void off() {
        encendida = false;
    }

    @Override
    //Revisa si la radio esta encendida o apagada
    public boolean isOn() {
        return encendida;
    }

    @Override
    //Permite al usuario elegir entre AM y FM
    public void setFrequence(String freq) throws Exception {
        Frecuencia = freq;
    }

    @Override
    //Te muestra la frecuencia en la que se encuentra
    public String getFrequence() {
        return Frecuencia;
    }

    @Override
    //Aumenta la posicion de la estacion
    public void Forward() {
        if(Frecuencia.equals("FM")){
            FM = FM + 0.2;
            if(FM>107.9){
                FM = 87.9;
            }
        }
        if(Frecuencia.equals("AM")){
            AM = AM +10;
            if(AM >1610){
                AM = 530;
            }
        }
        
    }

    @Override
    public void Backward() {
        //Disminuye la posicion de la estacion
        if(Frecuencia.equals("FM")){
            FM = FM - 0.5;
            if(FM<87.9){
                FM = 107.9;
            }
        }
        if(Frecuencia.equals("AM")){
            AM = AM -10;
            if(AM<530){
                AM = 1610;
            }
        }
        
    }

    @Override
    //Muestra en que estacion esta en FM
    public double getFMActualStation() {
        return FM;
    }

    @Override
    //Muestra en que estacion esta en AM
    public int getAMActualStation() {
        return AM;
    }

    @Override
    //Cambia la estacion en FM
    public void setFMActualStation(double actualStation) {
        FM = actualStation;
        
    }

    @Override
        //Cambia la estacion en AM
    public void setAMActualStation(int actualStation) {
        AM = actualStation;
    }

    @Override
        //Guarda la estacion fm
    public void saveFMStation(double actualStation, int slot) {
        ListaFM[slot] = actualStation;
    }

    @Override
        //Guarda la estacion AM
    public void saveAMStation(int actualStation, int slot) {
        ListaAM[slot] = actualStation;

    }

    @Override
    //Obtiene el dato de la posicion en el array FM
    public double getFMSlot(int slot) {
        return ListaFM[slot];
    }

    @Override
    //Obtiene el dato de la posicion en el array FM
    public int getAMSlot(int slot) {
        return ListaAM[slot];
    }


    //Son setters y getters basicos.
    public boolean isEncendida() {
        return encendida;
    }

    public void setEncendida(boolean encendida) {
        this.encendida = encendida;
    }

    public String getFrecuencia() {
        return Frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        Frecuencia = frecuencia;
    }

    public double getFM() {
        return FM;
    }

    public void setFM(double fM) {
        FM = fM;
    }

    public int getAM() {
        return AM;
    }

    public void setAM(int aM) {
        AM = aM;
    }

    public int[] getListaAM() {
        return ListaAM;
    }

    public void setListaAM(int[] listaAM) {
        ListaAM = listaAM;
    }

    public double[] getListaFM() {
        return ListaFM;
    }

    public void setListaFM(double[] listaFM) {
        ListaFM = listaFM;
    }
    



    
}
