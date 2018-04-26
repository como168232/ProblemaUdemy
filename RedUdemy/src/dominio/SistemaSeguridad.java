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
public class SistemaSeguridad {
    private Red red;
    
    public SistemaSeguridad(Red red){
        this.red = red;
    }
    
    public boolean actua(){
        boolean resultado = false;
        System.out.println("Empezando actuación de Sistema de Seguridad");
        for(Aparato aparato: red.getAparatos()){
            if(red.esEstable()){
                System.out.println("La red se encuentra estable");
                break;
            }
            System.out.println("Apagando "+aparato);
            aparato.apagar();
        }
        return resultado;
    }
}
