/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mario
 */
public class SistemaSeguridadBasico extends SistemaSeguridad{

    public SistemaSeguridadBasico(Red red, Alarma alarma) {
        super(red,alarma);
    }

    @Override
    protected List<Aparato> getAparatos() {
        return new ArrayList<>(red.getAparatos());
    }
    
}
