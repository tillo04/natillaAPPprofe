package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Entradas del problema
        String nombreUsuario = "tillo";
        short edadUsuario = 34;
        String telefonoUsuario = "3225962363";
        String documentoIdentidad = "1017187878";
        int cuotaEnero;
        int cuotaFebrero;
        int cuotaMarzo;
        int cuotaAbril;
        int cuotaMayo;
        int cuotaJunio;
        int cuotaJulio;
        int cuotaAgosto;
        int cuotaSeptiembre;
        int cuotaOctubre;
        int cuotaNoviembre;
        String direccionUsuario = "Cll 50# 80-20";
        double costoInscripcion = 150000.0;
        float tasaInteresNatillera = 0.1F;
        double saldoFinalUsuario;

        //PROCESO

        //1. Asignar un valor especifico a una variable
        //desde el TECLADO (Recibir datos)
        Scanner leerDato = new Scanner(System.in);

        System.out.println("cual es tu nombre?");
        System.out.println("bienvenido " + nombreUsuario);
        nombreUsuario=leerDato.nextLine();
        System.out.println("bienvenido " + nombreUsuario);

        System.out.println("Cual es tu telefono?");
        telefonoUsuario=leerDato.nextLine();
        System.out.println("El telefono es: "+telefonoUsuario);

        System.out.println("Cual es tu documento?");
        documentoIdentidad=leerDato.nextLine();
        System.out.println("Mi documento es: "+documentoIdentidad);

        System.out.println("cuantos años tienes?");
        edadUsuario=leerDato.nextShort();
        System.out.println("Mi edad es" +edadUsuario);

        System.out.println("Cual es tu cuota?");
        costoInscripcion=leerDato.nextDouble();
        System.out.println("Tu cuota es: " +costoInscripcion);

        








    }
}