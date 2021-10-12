package AFP_1p1_Empleado;

import AFP_1p1_Trabajador.AFP_1p1_Trabajador;
/**
 *
 * @author CLAROS
 */
public class AFP_1p1_Empleado extends AFP_1p1_Trabajador {

    private double sueldoE;
    private double impuestos;
    private double DescuentoEmpleadorAFP = 7.75;
    private int porcentaje = 100;

    //Constructor
    public AFP_1p1_Empleado(String nombre, int rut, double sueldo) {
        super(nombre, rut);
        this.sueldoE = sueldo;
        this.impuestos = (sueldoE*(DescuentoEmpleadorAFP)/porcentaje);
    }

    //Impuestos para el empleador
    public double calcularDescuentoE() {
        return (impuestos);
    }
    //Sueldo final para el empleador
    public double calcularPagaFinal(){
    return (sueldoE - impuestos);
    }
    //Retornando resultados a clase padre Trabajador
    @Override
    public String toString() {
        return super.toString() +"\tSueldo empleador: $"+sueldoE+""
                + "\tDescuento (7.75%): $"+ calcularDescuentoE()+""
                + "\tSueldo final: "+calcularPagaFinal();
    }
}
