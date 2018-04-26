package dominio;
public class Aparato {
    private String nombre;
    private boolean encendido;
    private final int consumo;

    public Aparato(String nombre, int consumo) {
        this.nombre = nombre;
        this.consumo = consumo;
    }
    
    public boolean isEncendido() {
        return encendido;
    }
    
    public void apagar() {
        encendido = false;
    }
    
    public void encender(){
        encendido = true;
    } 
    
    public int getConsumoActual() {
        if(isEncendido())
            return consumo;
        else
            return 0;
    }

    public int getConsumo() {
        return consumo;
    }

    @Override
    public String toString() {
        return "Aparato [nombre=" + nombre + ", consumo=" + consumo + ", encendido=" + encendido + ']';
    }
    
    
    
}
