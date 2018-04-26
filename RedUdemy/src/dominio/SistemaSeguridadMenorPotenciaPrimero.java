/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Mario
 */
public class SistemaSeguridadMenorPotenciaPrimero extends SistemaSeguridad {

    public SistemaSeguridadMenorPotenciaPrimero(Red red) {
        super(red);
    }

    @Override
    protected List<Aparato> getAparatos() {
        List<Aparato> aparatos = new ArrayList<>(red.getAparatos());
        
        Collections.sort(aparatos, new Comparator<Aparato>(){
            @Override
            public int compare(Aparato t, Aparato t1) {
                return t.getConsumo() - t1.getConsumo();//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
        return aparatos;
    }

}
