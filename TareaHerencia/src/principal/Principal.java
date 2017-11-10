package principal;
import laempresa.EmpresaPrivada;
import personal.Trabajador;
/**
 * Autor: Andres Roman
 * Fecha: 10/11/2017
 */
public class Principal {
    public static void main(String[] args) {
        // Creacion de objetos tipo Trabajador
        Trabajador t1 = new Trabajador("Ana Luisa", "Velez Alcivar", 30, 12903939, 100, 40, 10);
        Trabajador t2 = new Trabajador("Mario Anibal", "Vela Narvaez", 35, 212889, 100, 50, 10);
        // Creacion objeto EmpresaPrivada
        Trabajador []t = {t1, t2};
        EmpresaPrivada e = new EmpresaPrivada(t);
        System.out.println(e);
    }
    
}
