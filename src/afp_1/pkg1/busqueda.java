package afp_1.pkg1;

import afp_1.pkg1.trab;
import java.util.Vector;

/**
 *
 * @author CLAROS
 */
public class busqueda {

    static trab busqueda(int rut_, Vector trabajador) {
        trab p, retornP = null;
        for (int x = 0; x < trabajador.size(); x++) {
            p = (trab) trabajador.elementAt(x);
            if (p.getCodigo() == rut_) {
                retornP = p;
            }
        }
        return retornP;
    }
}
