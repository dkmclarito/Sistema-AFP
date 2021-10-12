package afp_1.pkg1;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author CLAROS
 */
public class AFP_11 {

    /**
     * @param args the command line arguments
     */
    static int opcion;
    public static String name;
    public static int rut_;
    public static int sueldoT;
    public static int sueldoE = 0;
    
    public static void main(String[] args) {
    trab p;
    MostrarEmpleados m;
    Vector tr = new Vector();
        Scanner entrada = new Scanner(System.in);
        //Menu principal

        int i = 0;
        try {
            do {
                i++;
                System.out.println(""
                        + "----------MENÚ---------"
                        + "\n 1. Registrar trabajador"
                        + "\n 2. Buscar trabajador"
                        + "\n 3. Ver trabajadores registrados"
                        + "\n 4. Salir\n"
                        + "-----------------------");
                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1:
                        System.err.println("->Registrando trabajador " + i + "<-");
                        System.out.print("¿Cuál es su nombre? ");
                        name = entrada.next();
                        System.out.print("¿Cuál es su RUT? ");
                        rut_ = entrada.nextInt();
                        System.out.print("¿Cual es su salario? $");
                        sueldoT = entrada.nextInt();
                        System.out.print("¿Cuál es el sueldo de su empleador? $");
                        sueldoE = entrada.nextInt();
                        p = busqueda.busqueda(rut_, tr);
                        if (p == null) {
                            tr.addElement(new trab(rut_, name, sueldoT));
                            System.err.println("Trabajador registrado");
                        } else {
                            System.err.println("Ya existe este trabajador");
                        }
                        break;

                    case 2:
                        System.err.println("->Buscando trabajador<-");
                        try {
                            System.out.print("Ingresar RUT: ");
                            rut_ = entrada.nextInt();
                        } catch (Exception e) {
                            System.err.println("ERROR: Ingrese dato numérico:");
                            Scanner sc5 = new Scanner(System.in);
                            System.out.print("Ingresar RUT: ");
                            rut_ = sc5.nextInt();
                        }
                        p = busqueda.busqueda(rut_, tr);
                        if (p != null) {
                            p.mostrarResultado();
                        } else {
                            System.err.println("Trabajador no existente");
                        }
                        break;
                    case 3:
                         MostrarEmpleados.busqueda(tr, rut_, sueldoT);
                        break;
                case 4:
                        System.err.println("Registraste " + (i - 1) + " nuevos trabajadores");
                        break;
                    default:
                        System.err.println("Ingrese una opcion del menú");
                }

            } while (opcion != 4);
            } catch (Exception e) {
            System.err.println("ERROR: Ingresaste un dato inválido");
            System.err.println("El proceso a terminado");
            System.err.println("Corre el programa para volver a iniciar");
        }

        }
    }
