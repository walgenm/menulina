package Walgen_Moron_funciones;


public class opcionE {
    // Funcion Tipo 4: Con parametros / Con retorno
    public static double obtenerMayor(double a, double b, double c, double d) {
        double mayor = a;
        
        if (b > mayor) {
            mayor = b;
        }
        if (c > mayor) {
            mayor = c;
        }
        if (d > mayor) {
            mayor = d;
        }
        
        return mayor;
    }
}

