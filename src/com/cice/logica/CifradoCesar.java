package com.cice.logica;

import java.util.Arrays;

public class CifradoCesar {

    private char[] abcdario;

    public CifradoCesar(){
        this.abcdario=new char[26];
        generarAbecedario();
        System.out.println(this.toString());
    }

    private void generarAbecedario(){
        char firstChar ='a';
        for (int i=0;i<abcdario.length;i++){
            this.abcdario[i]=firstChar++;
        }
    }

    public String cifrarCadena (String cadenaDescifrada, int posiciones){
        String cadenaCifrada ="";
        int posicionCifrada=0;
        for (int i=0; i<cadenaDescifrada.length();i++) {
                char caracter = cadenaDescifrada.charAt(i);
                for (int j = 0; j < this.abcdario.length; j++) {
                    if (abcdario[j] == caracter) {
                        posicionCifrada = (j + posiciones) % this.abcdario.length;
                        cadenaCifrada += abcdario[posicionCifrada];
                        break;
                    }
                }

        }
        return cadenaCifrada;
    }

    public String descifrarCadena (String cadenaCifrada, int posiciones){
        String cadenaDescifrada ="";
        int posicionCifrada=0;
        for (int i=0; i<cadenaCifrada.length();i++) {
            char caracter = cadenaCifrada.charAt(i);
            for (int j = 0; j < this.abcdario.length; j++) {
                if (abcdario[j] == caracter) {
                    posicionCifrada = (j - posiciones+this.abcdario.length) % this.abcdario.length;
                    break;
                }
            }
            cadenaDescifrada += abcdario[posicionCifrada];
        }
        return cadenaDescifrada;
    }

    public String toString(){
        return "CifradoCesar{" + " abecedario "+ Arrays.toString(abcdario)+ '}';
    }
}
