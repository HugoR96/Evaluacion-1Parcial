package Ejercicio2;
import Ejercicio1.Empleado;

import java.util.*;
    public class Main {
        public static void main(String[] args) {
            List<Vehiculo> vehiculos = new ArrayList<>();
            vehiculos.add(new Vehiculo("Ford", "Mustang", 2500));
            vehiculos.add(new Vehiculo("Subaru", "Impreza", 4000));
            vehiculos.add(new Vehiculo("Lamborghini", "Aventator", 8000));
            for (Vehiculo vehiculo : vehiculos){
            vehiculo.verDetalles();
        }
        for (Vehiculo vehiculo : vehiculos ){
            System.out.println(vehiculo);
        }
    }

}
