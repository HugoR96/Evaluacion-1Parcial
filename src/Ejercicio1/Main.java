package Ejercicio1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado("Juan",20,2500));
        empleados. add(new Empleado("Miguel",26,3000));
        empleados.add(new Empleado("Pedro",19,1500));
        for (Empleado empleado : empleados){
            empleado.Aumento();
        }
        for (Empleado empleado : empleados){
            System.out.println(empleado);
        }
    }

}
