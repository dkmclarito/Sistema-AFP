package afp_1.pkg1;

import AFP_1p1_Consultor.AFP_1p1_Planilla;
import AFP_1p1_Empleado.AFP_1p1_Empleado;
import AFP_1p1_Trabajador.AFP_1p1_Trabajador;
import static afp_1.pkg1.AFP_11.name;

/**
 *
 * @author CLAROS
 */
public class trab {
    int r;
    int s;
    double p;
    String n;

    trab(int rut, String nombre, double precio) {
        r = rut;
        n = nombre;
        p = precio;
    }

    public int getCodigo() {
        return r;
    }

    public void mostrarResultado() {
        // public void ClasesPadreHijo() {
        AFP_1p1_Trabajador trabajador;
        AFP_1p1_Empleado empleador;
        AFP_1p1_Planilla planilla;
        AFP_11 p = new AFP_11();
        String nameE = "Santos";
        int rutE = 123;

        //Creacion de objs
        trabajador = new AFP_1p1_Trabajador(name, p.rut_);
        empleador = new AFP_1p1_Empleado(nameE, rutE, p.sueldoE);
        planilla = new AFP_1p1_Planilla(name, p.rut_, p.sueldoT);

        //Salida estandar con toString
        System.err.println("---->Trabajador<----");
        System.out.println(trabajador);
        System.err.println("---->Empleador<----");
        System.out.println(empleador);
        System.err.println("---->Planilla<----");
        System.out.println(planilla);
    }
}
