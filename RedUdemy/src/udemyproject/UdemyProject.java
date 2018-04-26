package udemyproject;

import dominio.*;

public class UdemyProject {
    public static void main(String[] args) {
        Aparato tele = new Aparato("Television",30);
        tele.encender();
        Red miRed = new Red(25);
        miRed.addAparato(tele);
        SistemaSeguridad miSistemaSeguridad = new SistemaSeguridad(miRed);
        miSistemaSeguridad.actua();
        System.out.println("Es la red estable? "+ miRed.esEstable());
        System.out.println("Estado final de la red: "+miRed);
        System.out.println("linea mas nueva"); //comentario
    }
}
