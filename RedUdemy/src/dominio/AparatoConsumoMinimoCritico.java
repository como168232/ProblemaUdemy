/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author Mario
 */
public class AparatoConsumoMinimoCritico extends AparatoCritico{
    private final int consumoMinimo;
    private int consumoActual;
    public AparatoConsumoMinimoCritico(String nombre, int consumo, int consumoMinimo) {
        super(nombre, consumo);
        this.consumoMinimo = consumoMinimo;
    }

    @Override
    public void solicitudApagado() {
        if(getEncendido()){
            consumoActual = consumoMinimo;
            System.out.println("Pasamos a consumo mínimo"+this);
        }
    }

    @Override
    public int getConsumoActual() {
        return consumoActual;
    }

    @Override
    public void encender() {
        consumoActual = getConsumo();
    }

    @Override
    public String toString() {
        return super.toString()+ "( consumo actual=" + consumoActual + ')';
    }
    
    @Override
    public boolean getEncendido(){
        return consumoActual>0;
    }
    
    @Override
     public void apagar(){
        
    }
}
