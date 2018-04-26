package dominio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Red {
    private Set<Aparato> aparatos;
    private final int potenciaMaxima;
    
    public Red(int potenciaMaxima){
        this.potenciaMaxima = potenciaMaxima;
        aparatos = new HashSet<>();
    }
    
    public void addAparato(Aparato aparato){
        System.out.println("Añadiendo "+aparato);
        aparatos.add(aparato);
    }
    
    public int size(){
        return aparatos.size();
    }

    public int getConsumoActual() {
        int consumo = 0;
        for(Aparato aparato: aparatos){
            consumo += aparato.getConsumoActual();
        }
        return consumo;
    }

    public boolean esEstable() {
        return getConsumoActual()<= potenciaMaxima;
    }

    public Collection<Aparato> getAparatos() {
        return new ArrayList<>(aparatos);
    }

    @Override
    public String toString() {
        return "Red [aparatos=" + aparatos + ']';
    }
    
    
}
