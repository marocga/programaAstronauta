package com.mycompany.examenprogramacion1ev;
import java.util.Scanner;
/**
 *
 * @author Marcos
 */
public class Marte {
    public static void peso(){
    double masa;
    char seguir='a';
    final double gravedad=3.72;
    Scanner teclado=new Scanner(System.in);
        while(seguir!='N'&&seguir!='n'){
            System.out.println("Por favor, introduzca su masa");
            masa=teclado.nextDouble();
            System.out.println("Los resultados indican que su masa en el planeta Marte será: " + (masa*gravedad));
            System.out.println("¿Quieres continuar ejecutando el programa? (Para parar el programa escriba N)");
            seguir=teclado.next().charAt(0);
        }
        System.out.println("El programa se ha detenido");
        teclado.close();
    }
}
