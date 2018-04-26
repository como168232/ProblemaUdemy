package udemyproject;

import dominio.*;

public class UdemyProject {
    public static void main(String[] args) {
        Aparato tele = new AparatoCritico("Television",35);
        Aparato radio = new AparatoConsumoMinimoCritico("Radio",30,3);
        tele.encender();
        radio.encender();
        
        Red miRed = new Red(40);
        miRed.addAparato(tele);
        miRed.addAparato(radio);
        
        SistemaSeguridad miSistemaSeguridad = new SistemaSeguridadMenorPotenciaPrimero(miRed,new AlarmaSonora());
        miSistemaSeguridad.actua();
        
        System.out.println("Es la red estable? "+ miRed.esEstable());
        System.out.println("Estado final de la red: "+miRed);
    }
}
