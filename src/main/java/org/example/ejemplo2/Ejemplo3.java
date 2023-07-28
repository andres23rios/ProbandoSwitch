package org.example.ejemplo2;

import java.util.Scanner;

public class Ejemplo3 {
    public static void main(String[] args) {
        Scanner entradaTeclado= new Scanner(System.in);
        System.out.println("Digite la temperatura actual");
        Double temperaturaAmbiente= entradaTeclado.nextDouble();
        String temperaturaComoTexto= temperaturaAmbiente.toString();
        switch (temperaturaComoTexto){
            case "20.0":
                temperaturaAmbiente=25.0;
                break;
            case "30.0":
                temperaturaAmbiente= 25.0;
                break;
            case "40.0":
                temperaturaAmbiente= 20.0;
            default:
                System.out.println("Digite la temperatura deseada");
                temperaturaAmbiente= entradaTeclado.nextDouble();

        }



    }
}
