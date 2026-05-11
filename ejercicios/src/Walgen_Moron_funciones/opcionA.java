package Walgen_Moron_funciones;

public class opcionA {
    // Funcion Tipo 3: Con parametros / Sin retorno
    public static void ejecutarProducto(double n1, double n2, double n3) {
        
        // Verificamos si CUALQUIERA de los tres numeros es cero
        if (n1 == 0 || n2 == 0 || n3 == 0) {
            System.out.println("No se puede multiplicar por 0");
        } 
        // Si ninguno fue cero, revisamos si el primero es positivo
        else if (n1 > 0) {
            double producto = n1 * n2 * n3;
            System.out.println("El primer numero es positivo.");
            System.out.println("El producto de los tres es: " + producto);
        } 
        // Si no fue cero ni positivo, entonces el primero es negativo
        else {
            double producto = n1 * n2 * n3;
            System.out.println("Ingresaste un numero negativo, aqui tienes la multiplicacion con ese negativo: " + producto);
        }
    }
}
    
    

