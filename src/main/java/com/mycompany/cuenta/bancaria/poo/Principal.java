package com.mycompany.cuenta.bancaria.poo;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        // TODO: Adiciona aquí el código que deseas para la Cuenta Bancaria.
        Scanner sc = new Scanner(System.in);

        String titular = "";
        String numeroCuenta = "";
        double saldo = 0;
        double valorIngreso;
        double valorRetiro;
        int opcion = 0;
        System.out.println("Ingrese el nombre del titular:");
        titular = sc.nextLine();
        System.out.println("Ingrese el numero de cuenta a asignar: ");
        numeroCuenta = sc.nextLine();
        System.out.println("Ingrese el saldo actual");
        saldo = sc.nextDouble();

        CuentaBancaria miCuenta = new CuentaBancaria(titular, numeroCuenta, saldo);

        do {
            System.out.println("Ingrese el numero de la opcion que desea acceder: ");
            System.out.println("1.Ingresar dinero\n2.Retirar dinero\n3.Consultar saldo con intereses\n4.Cambiar Interes\n5.salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("digite el valor a ingresar");
                    valorIngreso = sc.nextDouble();

                    System.out.println("El nuevo saldo es: $"+miCuenta.ingresar(valorIngreso));;

                    break;
                case 2:
                    System.out.println("digite el valor a retirar");
                    valorRetiro = sc.nextDouble();
                    System.out.println("El nuevo saldo es: $"+miCuenta.retirar(valorRetiro));;

                    break;
                case 3:
                    System.out.println("Su saldo con intereses es: $" + miCuenta.calcularInteres());

                    break;
                case 4:
                    System.out.println("ingrese el nuevo valor del interes");
                    double interes = sc.nextDouble();
                    miCuenta.setTipoInteres(interes);

                    break;
                case 5:

                    System.exit(0);
                    break;
                default:
                    throw new AssertionError();
            }

        } while (opcion != 5);

    }
}
