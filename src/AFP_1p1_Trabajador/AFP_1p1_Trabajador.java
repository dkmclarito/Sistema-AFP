package AFP_1p1_Trabajador;

import java.util.Date;

/**
 *
 * @author CLAROS
 */
public class AFP_1p1_Trabajador {

    private final String nombre;
    private final int RUT;

    //Constructor
    public AFP_1p1_Trabajador(String nombre, int rut) {
        this.nombre = nombre;
        this.RUT = rut;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\tRUT: " + RUT;
    }
}
