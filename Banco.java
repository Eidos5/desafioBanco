

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre = "Tony Stark";
        String tipoCuenta = "Corriente";
        double saldoDisponible = 1599.199;
        int opcion = 0;


        while (opcion != 9) {
            double retiro;
            double consignar;
            System.out.println("*******************************************");
            System.out.println("Nombre del cliente : " + nombre);
            System.out.println("Tipo de cuenta : " + tipoCuenta);
            System.out.println("Saldo disponible :  $ " + saldoDisponible);
            System.out.println("*******************************************");
            System.out.println("***** Escriba el numero de opcion que desea *****");
            System.out.println("1 -- Consultar Saldo");
            System.out.println("2 -- Retirar");
            System.out.println("3 -- Depositar");
            System.out.println("9 -- Salir");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("El saldo disponible es : $" + saldoDisponible);
                    break;
                case 2:
                    System.out.println("Ingrese valor a retirar: ");
                    retiro = teclado.nextDouble();
                    if (retiro < saldoDisponible) {
                        System.out.println("Su retiro fue de : $" + retiro);
                        saldoDisponible = saldoDisponible - retiro;
                        System.out.println("Nuevo saldo disponible : $" + saldoDisponible);
                    } else {
                        System.out.println("Saldo insuficiente para esta transaccion");
                    }

                    break;
                case 3:
                    System.out.println("Ingrese el valor a depositar : ");
                    consignar = teclado.nextDouble();
                    System.out.println("Su consignacion fue de : $" + consignar);
                    saldoDisponible = saldoDisponible + consignar;
                    System.out.println("Nuevo saldo disponible : $" + saldoDisponible);

                    break;
                case 9:
                    System.out.println("Gracias por utilizar nuestro servicios");
                    System.out.println("Programa finalizado");

                    break;
                default:
                    System.out.println("Seleccione un opcion valida");
                    break;

            }

        }

    }
}

