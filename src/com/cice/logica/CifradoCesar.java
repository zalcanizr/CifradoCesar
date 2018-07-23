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

    public String cifrarCadena (String cadena, int posiciones){
        String cadenaCifrada =null;
        for (int i=0; i<cadena.length();i++){
            cadenaCifrada+=abcdario[i+posiciones];
        }

        return cadenaCifrada;
    }

    public String descifrarCadena (String cadena, int posiciones){
        String cadenaDescifrada =null;
        for (int i=0; i<cadena.length();i++){
            cadenaDescifrada+=abcdario[i-posiciones];
        }
        return cadenaDescifrada;
    }

    public String toString(){
        return "CifradoCesar{" + " abecedario "+ Arrays.toString(abcdario)+ '}';
    }
}
