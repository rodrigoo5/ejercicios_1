import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Calculadora de dropinas");
        System.out.println("Ingrese la cantidad a pagar");
        double cantidad = Entrada.nextDouble();
        System.out.println("Ingrese el % de propina");
        int porcentaje = Entrada.nextInt();
       /* if (porcentaje < 15) {
            System.out.println("El servicio no fue bueno ");
        } else {
            System.out.println("El servicio fue bueno");
        }
        */
        if (porcentaje < 15) {
            System.out.println("El servicio no fue muy bueno ");
        } else if (15 <= porcentaje && porcentaje <30)       {
            System.out.println("El servicio fue bueno");
        } else {
            System.out.println("El servicio fue muy bueno");
        }

        double total = (cantidad * porcentaje / 100);
        System.out.printf("El total es: %.1f", total);
    }

}
