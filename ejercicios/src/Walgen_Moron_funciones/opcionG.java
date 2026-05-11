package Walgen_Moron_funciones;

import java.util.Scanner;

public class opcionG {

    public static double[] radianes(){
        // Funcion Tipo 2: Sin parametros / Con retorno
        Scanner in = new Scanner(System.in);
        double radianes = 0, seno=0,coseno=0;
        boolean validarRadio = true;
        
        System.out.println("En este apartado calcularenos el seno y el coseno de un triangulo.");
        System.out.println("------------------------------------------------------------------");
        
        //Pedimos los radianes y verificamos que seann números
        //Usamos un ciclo para que pida el parametro hasta que sea el correcto
        while (validarRadio) {
            System.out.print("Introduce un los radianes: ");            
            if(in.hasNextDouble()){
                radianes = in.nextDouble();
                validarRadio = false; 
            }else{
                System.out.println("\n------------------------------------------------------------------");
                System.out.println("Error: Introduce un número");
                System.out.println("------------------------------------------------------------------");
                in.next();
            }
        }
        
        //Hacemos las operaciones
        seno = Math.sin(radianes);
        coseno = Math.cos(radianes);

       //Retornamos los datos a al menu
        return new double[]{seno, coseno};
    }
    
}
