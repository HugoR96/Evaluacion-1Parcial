package Ejercicio2;

public class Vehiculo{
        private String marca;
        private String modelo;
        private double precio;
        public Vehiculo() {
        }
        public Vehiculo(String marca, String modelo, double precio) {
            this.marca = marca;
            this.modelo = modelo;
            this.precio = precio;
        }
        public double getPrecio() {
            return precio;
        }
        public void verDetalles(){
            if (precio >0 && precio <24000) {
                System.out.println(" No esta en el rango");
            }else if (precio>2000 && precio <4000){
                System.out.println("Esta en el rango");
            }
            System.out.println("Marca"+ marca + " Modelo = " +modelo+ " Precio= "+precio);
        }
    }

