package getAndset;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int opcion = -1; 

        while (opcion != 0) {
            System.out.println("\n---------- Menu de Ejercicios ----------");
            System.out.println("1. Persona");
            System.out.println("2. Producto");
            System.out.println("3. Cuenta Bancaria");
            System.out.println("4. Curso");
            System.out.println("5. Estudiante");
            System.out.println("6. Termometro");
            System.out.println("7. Reloj");
            System.out.println("8. Contacto");
            System.out.println("9. Jugador");
            System.out.println("10. Factura");
            System.out.println("Presione 0 para salir del programa");
            System.out.print("Elija el inciso: ");

            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    try {
                        Persona p1 = new Persona("Juan", "Perez", -20);
                        p1.mostrar();
                        System.out.println("Probando validacion de edad...");
                        p1.setEdad(-1); 
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 2:
                    try {
                        Producto pr = new Producto(" P-100 ", " Teclado ", 25.50, 5);
                        pr.mostrar();
                        System.out.println("Intentando vender 10 unidades...");
                        pr.vender(10);
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 3:
                    try {
                    	CuentaBancaria c = new CuentaBancaria("Carlos Ruiz", 500.0, 5566);
                        c.mostrar();
                        System.out.println("Retirando con PIN incorrecto...");
                        c.retirar(50.0, 1111);
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 4:
                    try {
                        Curso cur = new Curso("Java POO", 90, 80, 100);
                        cur.mostrar();
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 5:
                    try {
                        Estudiante est = new Estudiante("2024-001", "Maria Lopez", 88.0);
                        est.mostrar();
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 6:
                    try {
                        Termometro t = new Termometro(37.0);
                        t.mostrar();
                        t.setCelsius(-500); 
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 7:
                    try {
                        Reloj r = new Reloj(12, 45, 30);
                        r.mostrar();
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 8:
                    try {
                        Contacto con = new Contacto("Elena", "77889900", "elena@mail.com");
                        con.mostrar();
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 9:
                    try {
                        Jugador j = new Jugador("Alpha_1");
                        j.actualizarPuntaje(500);
                        j.mostrar();
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 10:
                    try {
                        Factura f = new Factura("FAC-99", 5, 20.0);
                        f.mostrar();
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 0:
                    System.out.println("Usted ha presionado 0. El programa finalizara.");
                    break;

                default:
                    System.out.println("Opcion no valida, intente de nuevo.");
            }
        }
        sn.close();
    }
}