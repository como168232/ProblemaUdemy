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
public class AparatoCritico extends Aparato{
    
    public AparatoCritico(String nombre, int consumo) {
        super(nombre, consumo);
    }

    @Override
    public void solicitudApagado() {
         System.out.println("Solicitud Ignorada "+this);
    }
    
    
    
}
