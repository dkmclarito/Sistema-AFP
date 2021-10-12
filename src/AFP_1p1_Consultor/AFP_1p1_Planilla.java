package AFP_1p1_Consultor;

import AFP_1p1_Trabajador.AFP_1p1_Trabajador;

/**
 *
 * @author CLAROS
 */
public class AFP_1p1_Planilla extends AFP_1p1_Trabajador {

    private double impuestos;
    private int sueldoT;
    private double DescuentoTrabajadorAFP = 7.25;
    private int porcentaje = 100;

    //Constructor
    public AFP_1p1_Planilla(String nombre, int rut, int sueldo) {
        super(nombre, rut);
        this.sueldoT = sueldo;
        this.impuestos = (sueldoT * (DescuentoTrabajadorAFP) / porcentaje);
    }

    //Impuestos para el trabajador
    public double calcularDescuento() {
        return (impuestos);
    }
    
    //Sueldo final para el trabajador
    public double calcularPagaFinal() {
        return (sueldoT - impuestos);
    }

    //Retornando resultados a clase padre trabajador
    @Override
    public String toString() {
        return super.toString() + "\tSueldo trabajador: $" + sueldoT + ""
                + "\t\tDescuento (7.25%): $" + calcularDescuento() + ""
                + "\tSueldo final: $" + calcularPagaFinal();
    }
}
