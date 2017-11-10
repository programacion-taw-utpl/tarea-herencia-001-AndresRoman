package laempresa;
import personal.Trabajador;
/**
 * Autor: Andres Roman
 * Fecha: 10/11/2017
 */
public class EmpresaPrivada extends Empresa {
    private int ventas_mensual_fijo;
    private int numero_sucursales;
    // Constructor
    public EmpresaPrivada(Trabajador []t){
        super(t);
        establecer_ventas_mensual_fijo(200000);
        establecer_numero_sucursales(12);
    }
    // Metodos set
    public void establecer_ventas_mensual_fijo(int v){
        ventas_mensual_fijo=v;
    }
    public void establecer_numero_sucursales(int s){
        numero_sucursales=s;
    }
    // Metodos get
    public int obtener_ventas_mensual_fijo(){
        return ventas_mensual_fijo;
    }
    public int obtener_numero_sucursales(){
        return numero_sucursales;
    }
    // Metodo toString
    @Override
    public String toString(){
        String cadena_trabajadores="";
        Trabajador []A = obtener_trabajadores();
        for (int i=0; i<A.length; i++){
            cadena_trabajadores+=(i+1)+")\t"+A[i];
        }
        String cadena = String.format("%s\n"
                + "Ventas: $ %d\n"
                + "Sucursales: %d\n"
                + "Lista de trabajadores:\n"
                + "%s",
                super.toString(),
                obtener_ventas_mensual_fijo(),
                obtener_numero_sucursales(),
                cadena_trabajadores);
        return cadena;
    }
}
