package laempresa;
import personal.Trabajador;
/**
 * Autor: Andres Roman
 * Fecha: 10/11/2017
 */
public class Empresa {
    private String nombre;
    private String siglas;
    private String ciudad;
    protected Trabajador []trabajadores;
    // Constructor
    public Empresa (Trabajador []tr){
        establecer_nombre("Soluciones Software");
        establecer_siglas("SS's");
        establecer_ciudad("Loja");
        trabajadores=tr;
    }
    // Metodos set
    public void establecer_nombre(String nom){
        nombre=nom;
    }
    public void establecer_siglas(String sig){
        siglas=sig;
    }
    public void establecer_ciudad(String c){
        ciudad=c;
    }
    public void establecer_trabajadores(Trabajador []t){
        trabajadores=t;
    }
    // Metodos get
    public String obtener_nombre(){
        return nombre;
    }
    public String obtener_siglas(){
        return siglas;
    }
    public String obtener_ciudad(){
        return ciudad;
    }
    public Trabajador[] obtener_trabajadores(){
        return trabajadores;
    }
    // Metodo toString
    @Override
    public String toString(){
        
        String cadena = String.format("Empresa: %s\n"
                + "Siglas: %s\n"
                + "Ciudad: %s",
                obtener_nombre(),
                obtener_siglas(),
                obtener_ciudad());
        return cadena;
    }
}
