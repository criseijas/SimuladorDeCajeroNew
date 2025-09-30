import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double saldo = 1000;
        boolean entrada = false;

        System.out.println("💸 Bienvenido al Cajero Automático");

        while (!entrada) {


            System.out.println("""
                    ****** Menú ******
                    1 - Mostrar saldo
                    2 - Depositar
                    3 - Retirar
                    4 - Salir
                    """);
            int opcion = teclado.nextInt();
            ;

            switch (opcion) {
                case 1:
                    System.out.println("\uD83D\uDC49 Su saldo es: " + saldo);
                    break;
                case 2:
                    System.out.println("Ingrese el monto a depositar");
                    double deposito = teclado.nextDouble();
                    saldo += deposito;
                    break;
                case 3:
                    System.out.println("Ingrese el monto a retirar");
                    double retiro = teclado.nextDouble();
                    if (saldo < retiro) {
                        System.out.println("⚠\uFE0F Saldo insuficiente.");
                    } else {
                        saldo -= retiro;
                    }
                    break;
                case 4:
                    System.out.println("Gracias por utilizar nuetro servicio");
                    entrada = true;
                    break;
                default:
                    System.out.println("❌ Opción inválida. Intente de nuevo.");
                    break;
            }

        }
        teclado.close();
    }
}