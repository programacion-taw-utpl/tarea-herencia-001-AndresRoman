package personal;

/**
 * Autor: Andres Roman
 * Fecha: 10/11/2017
 */
public class Trabajador extends Persona {
    private int costo_seguro;
    private int horas_trabajadas;
    private int costo_por_hora;
    // Costructor
    public Trabajador (String n, String a, int e, int c, int cs, int h, int ch){
        super(n,a,e,c);
        establecer_costo_seguro(cs);
        establecer_horas_trabajadas(h);
        establecer_costo_por_hora(ch);
    }
    // Metodos set
    public void establecer_costo_seguro(int cs){
        costo_seguro=cs;
    }
    public void establecer_horas_trabajadas(int h){
        horas_trabajadas=h;
    }
    public void establecer_costo_por_hora(int ch){
        costo_por_hora=ch;
    }    
    // Metodos get
    public int obtener_costo_seguro(){
        return costo_seguro;
    }
    public int obtener_horas_trabajadas(){
        return horas_trabajadas;
    }
    public int obtener_costo_por_hora(){
        return costo_por_hora;
    }
    // Metodo
    public int obtener_sueldo(){
        int sueldo=0;
        sueldo=(horas_trabajadas*costo_por_hora)+costo_seguro;
        return sueldo;
    }
    // Metodo toString
    @Override
    public String toString(){
        String cadena = String.format("%s"
                + "\tSeguro: $ %d\n"
                + "\tHoras trabajadas: %d\n"
                + "\tValor por hora: $ %d\n"
                + "\tSueldo: $ %d\n",
                super.toString(),
                obtener_costo_seguro(),
                obtener_horas_trabajadas(),
                obtener_costo_por_hora(),
                obtener_sueldo());
        return cadena;
    }
}
