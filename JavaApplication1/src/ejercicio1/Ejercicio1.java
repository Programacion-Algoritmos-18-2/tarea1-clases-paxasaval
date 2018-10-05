/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;
import java.util.Scanner;
/**
 *
 * @author Salas
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        Estudiante e1=new Estudiante();
        for (int i = 0; i < 2; i++) {
            System.out.printf("Estudiante %d\n",i+1);
            System.out.println("Ingrese el nombre del Estudiante: ");
            e1.nombre=entrada.nextLine();
            System.out.println("Ingrese el apellido del Estudiante: ");
            e1.apellido=entrada.nextLine();
            System.out.println("Ingrese la edad del Estudainte: ");
            e1.edad=entrada.nextInt();
            System.out.println("Ingrese el codigo del Estudiante:");
            e1.codigo=entrada.nextInt();
            
            entrada.nextLine();
            System.out.printf("Nombre: %s\nApellido: %s\nEdad: %d\nCodigo: %d\n\n",e1.nombre,e1.apellido,e1.edad,e1.codigo);
            
        }
    }
    
}
