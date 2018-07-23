package com.cice;

import com.cice.logica.CifradoCesar;

public class Main {

    public static void main(String[] args) {
	// write your code here


        CifradoCesar cifrado=new CifradoCesar();
        String cadenaCifrada = cifrado.cifrarCadena("casa",3);
        String cadenaDescifrada=cifrado.descifrarCadena(cadenaCifrada,3);
        System.out.println("cadena cifrada: "+cadenaCifrada);
        System.out.println("cadena cadenaDescifrada: "+cadenaDescifrada);


    }
}
