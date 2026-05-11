package Walgen_Moron_funciones;

import java.util.Scanner;

public class opcionB {
  
  public static void radio(){
      // Funcion Tipo 1: Sin parametros / Sin retorno
      
      Scanner in = new Scanner(System.in);
      double radio =0,perimetro =0, diametro = 0,area=0;
      boolean validarRadio = true;
      
      System.out.println("En este apartado calcularenos el area y el perímetro de un circulo");
      System.out.println("------------------------------------------------------------------");

      
      //pedime el radio y verificamos que sea un número
      //Usamos un ciclo para que pida el parametro hasta que sea el correcto
      while (validarRadio) {   
          System.out.print("Introduce el radio del circulo: ");
          if (in.hasNextDouble()) {
            radio = in.nextDouble();
            validarRadio = false;
      } else {
            System.out.println("\n------------------------------------------------------------------");
            System.out.println("Error: Introduce un número");
            System.out.println("------------------------------------------------------------------");
            in.next();
      }}
      
      //Hacemos las operaciones
       diametro = 2*radio;
       perimetro = Math.PI * diametro;
       area = Math.PI * Math.pow(radio, 2);
       
      //mostramos los datos en la misma funcion
      System.out.println("\n------------------------RESULTADOS------------------------");
      System.out.println("El radio del circulo: "+radio);
      System.out.printf("Diametro: %.3f%n", diametro);
      System.out.printf("Perimetro: %.3f%n", perimetro);
      System.out.printf("Área: %.3f%n",  area);
      System.out.println("----------------------------------------------------------");
      

  }
  
}
