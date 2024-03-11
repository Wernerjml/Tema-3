package com.wjm.parcial;

import java.io.PrintWriter;

public class crearArchivo {
	 public static void main(String ars[]){
	        try {
	            PrintWriter writer = new PrintWriter("C:\\Users\\Public\\wernermonroy.txt");
	            writer.println("Escriba un programa que sea capaz de crear un archivo con el texto con su [nombre sin espacios] Ejemplo: jennerperez.txt, el cual contenga el texto de este numeral.");
	            writer.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	          }
	 }
}