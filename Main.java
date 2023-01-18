import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Resp;
        String freq = "FM";
        int RespInt;
        int Respuestamenu;
        boolean ciclo = true;
        Radio radio1 = new Radio();
        double FM = 92.2;
        int AM = 600;
        

        //Menu principal de opocione
        System.out.println("Bienvenido a su radio: ");
        while(ciclo == true){
            System.out.println("Elija una de las opciones que se le presentan");
            System.out.println("1. Encender Radio");
            System.out.println("2. Cambiar de frecuencia");
            System.out.println("3. Avanzar o retroceder estacion");
            System.out.println("4. Elegir Emisora");
            System.out.println("5. Guardar Emisora");
            System.out.println("6. Seleccionar Emisora Guardada");
            System.out.println("7. Apagar Radio");
            Respuestamenu = sc.nextInt();

            //Opcion 1: Encender radio
            if(Respuestamenu == 1){
                if(radio1.isOn() == false){
                    radio1.on();
                    System.out.println("Se ha encendido la radio");
                }
                else{
                    System.out.println("La radio ya esta encendida");
                }    
            }
            //Opcion 2: Cambiar frecuencia
            if(Respuestamenu == 2){
                if(radio1.isOn()== true){
                System.out.println("Actualmente la radio esta en: "+radio1.getFrequence());
                System.out.println("");
                System.out.println("Elija la frecuencia que desea: AM o FM");
                Resp = sc.next();
                try {
                    if(Resp.equals("AM") || Resp.equals("FM")){
                        freq = Resp;
                        radio1.setFrequence(freq);}
                    
                    else{
                        System.out.println("Elija una opcion disponible");
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            else {
                System.out.println("La radio esta apagada");
            }
            }
            //Opcion 3: Avanzar y retroceder estacion
            if(Respuestamenu == 3){
                if(radio1.isOn()== true){
                System.out.println("");
                System.out.println("Tu estacion actual es:");
                if(freq.equals("FM")){
                    System.out.println(radio1.getFMActualStation()); 
                }
                if(freq.equals("AM")){
                    System.out.println(radio1.getAMActualStation());
                }

                System.out.println("Quiere adelantar la emisora actual o quiere retroceder?\n1. Avanzar 2. Retroceder");
                Respuestamenu = sc.nextInt();
                if(Respuestamenu == 1){
                    radio1.Forward();
                }
                if(Respuestamenu == 2){
                    radio1.Backward();
                }
            }
            else {
                System.out.println("La radio esta apagada");
            }
            
        }
        //Opcion 4: Elije la emisora que se desea
            if(Respuestamenu == 4){
                if(radio1.isOn()== true){
                System.out.println("");
                System.out.println("Tu estacion actual es:");
                if(freq.equals("FM")){
                    radio1.getFMActualStation();
                    FM = radio1.FM;
                    System.out.println(FM);
                }
                if(freq.equals("AM")){
                    radio1.getAMActualStation();
                    AM = radio1.AM;
                    System.out.println(AM);
                }
                System.out.println("\nElija una estacion para escuchar: \n(si la frecuencia esta en FM solament pueden ser multiplos de 0.2 entre 87.9 to 107.9)");
                System.out.println("Si la frecuencia esta en AM, solamente puede elegir en multiplos de 10 entre 530 y 1610");
                RespInt = sc.nextInt();
                if(freq.equals("FM")){
                    radio1.setFMActualStation(RespInt);
                    radio1.FM = FM;
                }
                if(freq.equals("AM")){
                    radio1.setAMActualStation(RespInt);
                    radio1.AM = AM;
                }
                }
                else {
                    System.out.println("La radio esta apagada");
                }
            }
            //Opcion 5: Guardar la emisora en un arraylist
            if(Respuestamenu == 5){
                if(radio1.isOn()== true){
                System.out.println("En que posicion desea que se guarde la estacion actual? (1-12)");
                RespInt = sc.nextInt();
                try {
                    if(freq.equals("FM")){
                        radio1.saveFMStation(FM, RespInt);
                        System.out.println("Se ha guardado exitosamente la estacion en la posicion "+RespInt);
                    }
                    if(freq.equals("AM")){
                        radio1.saveAMStation(AM, RespInt);
                        System.out.println("Se ha guardado exitosamente la estacion en la posicion "+RespInt);
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                }
                else {
                    System.out.println("La radio esta apagada");
                }
            }
            //Seleccionar emisora guardada en arraylist
            if(Respuestamenu == 6){
                if(radio1.isOn()== true){
                System.out.println("Elija una estacion de radio guardada: (1-12)");
                RespInt = sc.nextInt();
                try {
                    if(freq.equals("FM")){
                        if(radio1.getFMSlot(RespInt) != 0){
                        FM = radio1.getFMSlot(RespInt);
                        System.out.println("Se ha cargado exitosamente la estacion actual");
                        }
                        else{
                            System.out.println("No hay nada guardado en ese espacio");
                        }
                    }
                    if(freq.equals("AM")){
                        if(radio1.getAMSlot(RespInt) != 0){
                        AM = radio1.getAMSlot(RespInt);
                        System.out.println("Se ha cargado exitosamente la estacion actual");
                        }
                        else{
                            System.out.println("No hay nada guardado en ese espacio");
                        }

                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            else {
                System.out.println("La radio esta apagada");
            }
            }
            //Apaga la radio
            if(Respuestamenu == 7){
                if(radio1.encendida == true){
                    radio1.off();
                    System.out.println("Se ha apagado la radio");
                }
                else{
                    System.out.println("La radio ya esta apagada");
                }   
            }

        }
    }
}
