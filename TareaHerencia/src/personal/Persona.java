package personal;

/**
 * Autor: Andres Roman
 * Fecha: 10/11/2017
 */
public class Persona {
    private String nombres;
    private String apellidos;
    private int edad;
    private int cedula;
    // Constructor
    public Persona (String n, String a, int e, int c){
        establecer_nombres(n);
        establecer_apellidos(a);
        establecer_edad(e);
        establecer_cedula(c);
    }
    // Metodos set
    public void establecer_nombres(String nom){
        nombres=nom;
    }
    public void establecer_apellidos(String ape){
        apellidos=ape;
    }
    public void establecer_edad(int e){
        edad=e;
    }
    public void establecer_cedula(int ced){
        cedula=ced;
    }
    // Metodos get
    public String obtener_nombres(){
        return nombres;
    }
    public String obtener_apellidos(){
        return apellidos;
    }
    public int obtener_edad(){
        return edad;
    }
    public int obtener_cedula(){
        return cedula;
    }
    // Metodo toString
    @Override
    public String toString(){
        String cadena = String.format("%s %s\n"
                + "\t%d años de edad\n"
                + "\tCI: %d\n",
                obtener_nombres(), obtener_apellidos(),
                obtener_edad(),
                obtener_cedula());
        return cadena;
    }
}
