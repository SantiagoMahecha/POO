package Principal;
import java.util.Scanner;

import Salud.Empleado;

public class Inicio 
{
    public static void main(String[] args) 
    {
        double respuesta;
        Scanner sc = new Scanner(System.in);

        Empleado empleado = new Empleado(null, 0, null, null, 0, 0, 0, null, null, 0, 0, null, 0);

        empleado.pedirDatos();
        empleado.mostrarPersona();
        respuesta = empleado.calcularImc();
        if (respuesta<20) 
    {
        System.out.println(respuesta+" El peso está por debajo de lo ideal");
    }

   else if (respuesta>=20 && respuesta<=25) 
    {
        System.out.println(respuesta+" El peso es ideal");
    }

    else if ( respuesta>25) 
    {
        System.out.println(respuesta+" Tiene sobrepeso");
    }
    
        empleado.mayorEdad();

        System.out.println("Ingrese el cargo:");
        empleado.setCargo(sc.next());
        System.out.println("Ingrese el valor de la hora:");
        empleado.setValorhora(sc.nextDouble());
        System.out.println("Ingrese las horas trabajadas:");
        empleado.setHorastrabajadas(sc.nextInt());

        empleado.calcularHonorarios();

        sc.close();
    }
}
