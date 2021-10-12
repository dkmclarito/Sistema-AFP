package afp_1.pkg1;

import java.util.Vector;

/**
 *
 * @author CLAROS
 */
//TERMINAR ESTA FUNCIONA DE BUSQUEDA
public class MostrarEmpleados {
        static void busqueda(Vector tr, int rut_,double sueldoT) {
        trab p;
        for (int x = 0; x < tr.size(); x++) {
            p = (trab) tr.elementAt(x);
            System.out.println(p);
        }
        
    }
}
