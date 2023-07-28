package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entradateclado = new Scanner(System.in);

        Double temperaturaambiente;

        System.out.println("--Bienvenido--");
        System.out.println("Ingrese la temperatura deseada");
        temperaturaambiente=entradateclado.nextDouble();

        if (temperaturaambiente ==20.0){
            temperaturaambiente= 25.0;
        } else if (temperaturaambiente==30.0) {
            temperaturaambiente=20.0;
    } else if (temperaturaambiente==40.0) {
                temperaturaambiente= 20.0;
        } else {
            System.out.println("Señor ususario ingrese su nivel de temperatura");
            temperaturaambiente=entradateclado.nextDouble();
        }
        System.out.println("Señor ususario su nivel de temperatura se ajustaron" + temperaturaambiente);
    }
    }