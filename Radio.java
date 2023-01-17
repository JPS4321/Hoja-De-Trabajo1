public class Radio implements IRadio {
    boolean encendida = false;
    String Frecuencia = "FM";
    double FM = 92;
    int AM = 600;
    int[] ListaAM = new int[12];
    double[] ListaFM = new double[12];
    


    @Override
    public void on() {
        encendida = true;
    }

    @Override
    public void off() {
        encendida = false;
    }

    @Override
    public boolean isOn() {
        return encendida;
    }

    @Override
    public void setFrequence(String freq) throws Exception {
        Frecuencia = freq;
    }

    @Override
    public String getFrequence() {
        return Frecuencia;
    }

    @Override
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
    public double getFMActualStation() {
        return FM;
    }

    @Override
    public int getAMActualStation() {
        return AM;
    }

    @Override
    public void setFMActualStation(double actualStation) {
        FM = actualStation;
        
    }

    @Override
    public void setAMActualStation(int actualStation) {
        AM = actualStation;
    }

    @Override
    public void saveFMStation(double actualStation, int slot) {
        ListaFM[slot] = actualStation;
    }

    @Override
    public void saveAMStation(int actualStation, int slot) {
        ListaAM[slot] = actualStation;

    }

    @Override
    public double getFMSlot(int slot) {
        return ListaFM[slot];
    }

    @Override
    public int getAMSlot(int slot) {
        return ListaAM[slot];
    }



    
}
