package Ejercicio1;

public class Empleado {
    private String nombre;
    private int edad;
    private double salario;
    public Empleado(){
    }

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    public double getSalario() {
        return salario;
    }
    public void Aumento() {
        if (salario < 3000) ;
        System.out.println("Recibio un aumento del 10% ");
        salario += 1.10;
    }else if (salario > 3000) {
        System.out.println("No recbibe el aumento "+salario);

    }
    public void imprimirdatos(){
        System.out.println("Nombre: " +nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Salario: "+salario);
    }
}
