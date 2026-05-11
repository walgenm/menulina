package Walgen_Moron_funciones;

import java.util.Scanner;

/*
Trabajo de funciones
Carrera: Ingenieria de sistemas
Sección: 05S-2626-D1
Alumnos: 
    Diego Medina   C.I: 31934048
    Walgen Morón   C.I: 31940641
*/

public class Menu {
    public static void main(String[] args) {
        //llamamos a las demas clases
        opcionA opA = new opcionA();
        opcionB opB = new opcionB();
        opcionE opE = new opcionE();
        opcionG opG = new opcionG();
        
        
        Scanner in = new Scanner(System.in);
        int op=1;
        boolean validarOp = true;
        
        System.out.println("--------------Menu de operaciones------------");
        System.out.println("1. Multiplicación selectiva");
        System.out.println("2. Calcular el area y perimetro de un círculo");
        System.out.println("3. Determinar el mayor");
        System.out.println("4. Radianes de un triángulo");
        System.out.println("5. Salir");
        System.out.println("-----------------------------------------------");
        
        do {
            System.out.print("Elige una opción: ");
             if (in.hasNextInt()){
                op = in.nextInt();
                if(op < 1 || op > 5){
                    System.out.println("Opción no valida");
                }else{
                    validarOp = false;
                };
             }else{
                System.out.println("\n------------------------------------------------------------------");
                System.out.println("Error: Introduce un número");
                System.out.println("------------------------------------------------------------------");
                in.next();
             
             }   
        } while (validarOp);
        
        
        double num1,num2,num3,num4,resultado;
        switch (op) {
            case 1:
                System.out.print("Ingresa el primer número: ");
                num1 = in.nextDouble();
                System.out.print("Ingresa el segundo número: ");
                num2 = in.nextDouble();
                System.out.println("Ingresa el tercer número: ");
                num3 = in.nextDouble();
                opA.ejecutarProducto(num1 , num2,num3);
                break;
            case 2:
                opB.radio();
                break;
            case 3:
                System.out.print("Ingresa el primer número: ");
                num1 = in.nextDouble();
                System.out.print("Ingresa el segundo número: ");
                num2 = in.nextDouble();
                System.out.print("Ingresa el tercer número: ");
                num3 = in.nextDouble();
                System.out.print("Ingresa el cuarto número: ");
                num4 = in.nextDouble();
                resultado = opE.obtenerMayor(num1,num2,num3,num4);
                System.out.println("El número mayor es: " + resultado);
                break;
            case 4:
                 double[] resultados = opG.radianes();
                 System.out.println("\n------------------------RESULTADOS------------------------");
                 System.out.println("El Seno es: "+ resultados[0]);
                 System.out.println("El Coseno es: "+ resultados[1]);
                 System.out.println("----------------------------------------------------------");
                break;
            case 5:
                
                break;
                
        }
        
    }
    
    
}
