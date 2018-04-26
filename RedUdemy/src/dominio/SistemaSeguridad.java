/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.List;

/**
 *
 * @author Mario
 */
public abstract class SistemaSeguridad {

    protected Red red;
    private Alarma alarma;
    
    public SistemaSeguridad(Red red, Alarma alarma) {
        this.red = red;
        this.alarma = alarma;
    }

    public boolean actua() {
        System.out.println("Empezando actuación de Sistema de Seguridad");
        for (Aparato aparato : getAparatos()) {
            if (red.esEstable()) {
                System.out.println("La red se encuentra estable");
                break;
            }
            aparato.solicitudApagado();
            
        }
        boolean esEstable = red.esEstable();
        if(!esEstable){
            alarma.activa();
        }
        return red.esEstable();
    }

    protected abstract List<Aparato> getAparatos();

}
